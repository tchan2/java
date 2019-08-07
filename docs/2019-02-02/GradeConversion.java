import java.util.Scanner;

public class GradeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a grade: ");
		double grade = input.nextInt();
		
		if (grade >= 92)
			System.out.println("Your grade is A.");
		else if (grade >= 85)
			System.out.println("Your grade is B.");
		else if (grade >= 75)
			System.out.println("Your grade is C.");
		else if (grade >= 60)
			System.out.println("Your grade is D.");
		else 
			System.out.println("Your grade is F.");

	}

}

