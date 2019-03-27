import java.math.*;
import java.util.*;

public class BigIntQ4 {

	public static void main(String[] args) {
		int p;
		int n = 0;
		BigInteger ans;
		int[] PrimesArray = new int[10000];
		
		// Put all prime numbers less than 10000 into PrimesArray array.
		for (int i = 2; i <= 10000; i++)
		{
			if (isPrime(i))
			{
				PrimesArray[n] = i;
				n++;
			}
			else
				n++;
		}
		
		// The resulting array will have zeros, so take those out.
		int[] Primes = removeZeros(PrimesArray, PrimesArray.length);
		
		// Obtain a random prime number from array.
		Random r = new Random();
		int index = r.nextInt(Primes.length);
		p = Primes[index];
		
		// Make 2 into a BigInteger to take the exponent of it.
		BigInteger two = new BigInteger("2");
		BigInteger squaredP = two.pow(p);

		// Do the equation, and then output.
		ans = (squaredP).subtract(BigInteger.ONE); 
		
		System.out.println("The value of p is: " + p);
		System.out.println("The answer is: " + ans);
	}
	
	// Checks if it is prime.
	public static boolean isPrime (int n)
	{
		if (n == 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i <= (int)Math.sqrt(n); i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	// Takes zeros out of array.
	public static int[] removeZeros (int[] arr, int length)
	{
		int n = 0;
		int[] temp = new int[arr.length];
		
		for (int i = 0; i < length; i++)
		{
			if (arr[i] != 0)
			{
				temp[i-n] = arr[i];
			}
			else
			{
				n++;
			}
		}
		
		int[] newArray = new int[temp.length - n];
		System.arraycopy(temp, 0, newArray, 0, newArray.length);
		
		return newArray;
	}
}
