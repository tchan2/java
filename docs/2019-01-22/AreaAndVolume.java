import java.util.Scanner;

public class AreaAndVolume {

	public static void main(String[] args) {
		double radius;
		double length;
		double pi = 3.14;
		Scanner input = new Scanner (System.in);
		
		// Enter the radius of the cylinder
		System.out.print("Enter the radius of the cylinder: ");
		radius = input.nextDouble();
		
		// Enter the length of the cylinder
		System.out.print("Enter the length of the cylinder: ");
		length = input.nextDouble();
		
		double area = radius * radius * pi;
		double volume = area * length;
		
		System.out.println("The area of the cylinder is: " + area);
		System.out.println("The volume of the cylinder is: " + volume);
	}

}
