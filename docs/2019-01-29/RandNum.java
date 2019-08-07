import java.util.Scanner;
import java.lang.*;

public class RandNum {

	public static void main(String[] args) {
		// Generate two random numbers
		int n1 = (int)(Math.random() * 100);
		int n2 = (int)(Math.random() * 100);
		
		System.out.print("What is the sqrt of " + n1 + " + " + n2 + "? ");
		Scanner input = new Scanner(System.in);
		
		int ans = input.nextInt();
		
		// Grade answer and display the result
//		if (ans == result)
//			System.out.print("You are correct!");
//		else
//			System.out.print("You are incorrect! It is " + result + ".");

	}

}
