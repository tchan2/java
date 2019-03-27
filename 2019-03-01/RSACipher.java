import java.math.*;
import java.util.*;

public class RSACipher {

	public static void main(String[] args) {
		
		// Input a string for encryption.
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string to encrypt: ");
		String s = input.nextLine();
		
		BigInteger cipherText = stringtoBI(s);
		
		// Generate p and q using the Java method, probablePrime().
		BigInteger p;
		BigInteger q;
		
		int bitlength = 2048;
		
		Random random = new Random();
		p = BigInteger.probablePrime(bitlength, random);
		q = BigInteger.probablePrime(bitlength, random);
		
		// Calculate the modulus number.
		BigInteger modNum = p.multiply(q);
		
		// Calculate the Euler number.
		BigInteger p1 = p.subtract(BigInteger.ONE);
		BigInteger q1 = q.subtract(BigInteger.ONE);
		
		BigInteger eulerTotient = p1.multiply(q1);
		
		// Do encryption and decryption.
		BigInteger e = encryptionKey(eulerTotient);
		BigInteger c = encryption(cipherText, e, eulerTotient); 
		
		String encryptedString = new String (c.toByteArray());

		BigInteger d = decryptionKey(e, eulerTotient);
		BigInteger m = decryption(c, d, modNum);
		
		String decrypted = new String(m.toByteArray());
		String decryptedString = new String(decrypted);
		
		// Output public key, encrypted and decrypted messages.
		System.out.println("The public key is: (" + e + ", " + eulerTotient + ")");
		
		System.out.println("\nThe encrypted message is: " + encryptedString);
		System.out.println("\nThe decrypted message is: " + decryptedString);
	}
	
	public static BigInteger encryptionKey(BigInteger n)
	{
		BigInteger e = new BigInteger("2");
		while (e.compareTo(n) == -1)
		{
			if (e.gcd(n).equals(BigInteger.ONE))
				return e;
			else
				e = e.add(BigInteger.ONE);
		}
		return BigInteger.ZERO;
	}
	
	public static BigInteger encryption(BigInteger m, BigInteger e, BigInteger n) 
	{
	   	 BigInteger c = m.modPow(e, n);
	   	 return c;
	}
	
	public static BigInteger decryptionKey(BigInteger e, BigInteger n)
	{
		BigInteger d = e.modInverse(n);
		return d;
	}
	
	public static BigInteger decryption(BigInteger c, BigInteger d, BigInteger n)
	{
		BigInteger m = c.modPow(d, n);
		return m;
	}
	
	public static BigInteger stringtoBI(String s) 
	{
	   	byte[] textBytes = s.getBytes();
	   	BigInteger text = new BigInteger(textBytes);
	   	return text;
	}

}
