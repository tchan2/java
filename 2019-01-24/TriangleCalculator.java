import java.util.Scanner;
import static java.lang.Math.sqrt;

public class TriangleCalculator {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first side of the triangle: ");
		a = input.nextDouble();
		
		System.out.print("Enter the second side of the triangle: ");
		b = input.nextDouble();
		
		System.out.print("Enter the third side of the triangle: ");
		c = input.nextDouble();
		
		double perimeter = a + b + c;
		double p = perimeter / 2;
		double area = sqrt(p*(p-a)*(p-b)*(p-c));
		
		boolean isValid = (a + c > b) && (a + b > c) && (b + c > a);
		if (isValid) 
		{
			System.out.println("The perimeter of the triangle is " + perimeter + ".");
			System.out.println("The area of the triangle is " + area + ".");
		}
		
		else 
		{
			System.out.println("Input is invalid!");	
		}

	}

}
