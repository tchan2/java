import java.util.Scanner;
public class Summation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		
		// Problem 1
		int sum = 0;
		int lastNum = (2*n) + 1;
		
		for (int i = 1; i <= lastNum; i++)
		{
			if (i % 2 != 0)
			{
				sum += i;
			}
		}
		System.out.println("The sum of 1+3+5...+(2n+1) is " + sum);
		
		// Problem 2
		double ans = 1;
		for (int i = 0; i <= 10000; i++)
		{
			ans += Math.pow(-1, i) / (Math.pow(i, 2) + 1);
		}
		System.out.println("The sum of this infinite series is " + ans);
	}
}
