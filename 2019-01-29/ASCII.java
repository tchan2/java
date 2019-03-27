import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter a number
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		// Display result
		System.out.println("The character for ASCII code " + n + " is " + (char)n + ".");

		}
}