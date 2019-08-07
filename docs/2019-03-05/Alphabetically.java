import java.util.Scanner;

public class Alphabetically {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// Prompt the user to enter three strings.
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		System.out.print("Enter the third string: ");
		String s3 = input.nextLine();
		
		System.out.println("The strings in alphabetical order are: ");
		
		// If s1 is higher alphabetically...
		if (s1.compareToIgnoreCase(s2) < 0 && s1.compareToIgnoreCase(s3) < 0)
		{
			System.out.println(s1);
			
			if (s2.compareToIgnoreCase(s3) < 0)
			{
				System.out.println(s2);
				System.out.println(s3);
			}
			
			else
			{
				System.out.println(s3);
				System.out.println(s2);
			}
		}
		
		// If s2 is highest alphabetically...
		else if (s1.compareToIgnoreCase(s2) > 0 && s2.compareToIgnoreCase(s3) < 0)
		{
			System.out.println(s2);
			
			if (s1.compareToIgnoreCase(s3) < 0)
			{
				System.out.println(s1);
				System.out.println(s3);
			}
			
			else
			{
				System.out.println(s3);
				System.out.println(s1);
			}
		}
		
		// If s3 is highest alphabetically...
		else
		{
			System.out.println(s3);
			
			if (s1.compareToIgnoreCase(s2) < 0)
			{
				System.out.println(s1);
				System.out.println(s2);
			}
			
			else
			{
				System.out.println(s2);
				System.out.println(s1);
			}
		}
	}
}
