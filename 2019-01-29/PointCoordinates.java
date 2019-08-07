import java.util.Scanner;

public class PointCoordinates {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter coordinate x: ");
		int x = input.nextInt();
		
		System.out.print("Enter coordinate y: ");
		int y = input.nextInt();
		int radius = 10;
		
		int cx = 0;
		int cy = 0;
		
		if ((Math.pow(x-cx, 2) + Math.pow(x-cy, 2) <= Math.pow(radius, 2)))
			System.out.println("The coordinates are within the circle.");
		else
			System.out.println("The coordinates are not within the circle.");

	}

}
