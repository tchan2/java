import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a string: ");
		String s1 = input.nextLine();
		
		System.out.println("The length is " + s1.length() + ".");
		System.out.println("The first character is " + s1.charAt(0) + ".");

	}

}
