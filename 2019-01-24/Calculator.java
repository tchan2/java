import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = input.nextDouble();
		
		System.out.print("Enter the second number: ");
		double b = input.nextDouble();
		
		double sum = a + b;
		double prod = a * b;
		double diff = a - b;
		float quotient = (float) (a / b);
		
		System.out.println("The sum of a and b is " + sum + ".");
		System.out.println("The difference of a and b is " + prod + ".");
		System.out.println("The product of a and b is " + diff + ".");
		System.out.println("The quotient of a and b is " + quotient + ".");
		
		if ((a > b) && (a == Math.floor(a)) && (b == Math.floor(b))) 
		{
			int intA = (int) a;
			int intB = (int) b;
			
			double mod = intA % intB;
			System.out.println("The result of a modulo b is " + mod + ".");	
		}
		
		else 
		{
			System.out.println("Invalid input! Try again!");
		}
	}
}
