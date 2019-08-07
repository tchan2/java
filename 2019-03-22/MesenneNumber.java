import java.math.*;
import java.util.*;

public class MesenneNumber {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		
		// Enter a number to check for primality
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		// Check for primality
		if (isPrime(n) && LuclasLehmer(n))
		{
			System.out.println("The number " + n + " is a Mersenne prime!");
			System.out.println("The number " + n + " has " + count(n) + " digit(s).\n");
		}
		
		else
			System.out.println("The number " + n + " is not a Mersenne prime!\n");
	
		
		System.out.println("Checking numbers to see if they are Mersenne primes...");
		
		for (int i = 2; i <= 31; i++)
		{
			if (isPrime(i) && LuclasLehmer(i)) 
			{
				System.out.println("The number " + i + " is a Mersenne prime!");
				System.out.println("The number " + i + " has " + count(i) + " digit(s).\n");
			}
			
			else
				System.out.println("The number " + i + " is not a Mersenne prime!\n");
		}
	}
	
	public static boolean isPrime (int n) {
		if (n == 2)
			return true;
		else if (n <= 1 || n % 2 == 0)
			return false;
		else 
		{
			int sq = (int)Math.sqrt(n);
			for (int i = 3; i <= sq; i += 2)
			{
				if (n % i == 0)
					return false;
			}
			return true;
		}
		
	}
	
	public static boolean LuclasLehmer (int n) {
		BigInteger one = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(2);
		BigInteger val = BigInteger.valueOf(4);
		BigInteger x = BigInteger.ONE.shiftLeft(n).subtract(one);
		
		if (n == 2)
			return true;
		else 
		{
			for (int i = 3; i <= n; i++)
				val = val.multiply(val).subtract(two).mod(x);
			return val.equals(BigInteger.ZERO);
		}
	}
	
	public static int count (int n) {
		int count = 0;
		
		while (n > 0)
		{
			n = n / 10;
			count = count + 1;
		}
		return count;
	}
}
