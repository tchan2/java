import java.util.Scanner;

public class CharEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter a character
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		
		// Display result
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch + ".");

	}

}
