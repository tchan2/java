import java.math.*;
import java.util.*;

public class PalindromePrime {
	public static void main(String[] args) 
	{
		int x = Integer.MAX_VALUE;
		System.out.print("Integer.MAX_VALUE is: " + x);
		
		for (int palinPrime = 1; palinPrime <= 107; palinPrime++)
		{
			if ((PrimalityTest(palinPrime) == true) && (PalinTest(palinPrime) == true))
			{
				System.out.println(palinPrime);
			}
		}
	}

	public static boolean PalinTest (int n)
	{
		int reverse = 0;
		int remainder = 0;
		int m = n;
		
		while (n > 0)
		{
			remainder = n % 10;
			reverse = reverse*10 + remainder;
			n = n / 10;
		}
			
		if (reverse == m)
			return true;
		else
			return false;
	}
	
	public static boolean PrimalityTest (int n)
	{
		if (n % 2 == 0 && n != 2)
			return false;
		
		double sqrtNum = Math.sqrt(n);
		
		for (long i = 3; i < sqrtNum; i += 2)
		{
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
}
