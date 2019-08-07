import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		/* int x = 1;
		while ((x*x) < 12000)
			x++;
		
		System.out.println("The largest number is: " + (x-1));
		*/
		
		Scanner input = new Scanner (System.in);
		int n;
		int total = 0, count = 0;
		int countPos= 0;
		int countNeg= 0;
		
		System.out.print("Enter an integer: ");
		n = input.nextInt();
		
		while (n != 0)
		{			
			if (n > 0)
				countPos++;
			else if (n < 0)
				countNeg++;
			
			total += n;
			count++;
			n = input.nextInt();
			
			System.out.println("The sum is: " + total);	
			System.out.println("The average is: " + (total/n));
		}

	}

}
