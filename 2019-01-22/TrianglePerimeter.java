import java.util.Scanner;

public class TrianglePerimeter {

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
		
		boolean isValid = (a + c > b) && (a + b > c) && (b + c > a);
		if (isValid) {
			System.out.println("The perimeter of the triangle is " + perimeter + ".");	
		}
		else {
			System.out.println("Input is invalid!");	
		}

	}

}
