import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		n = input.nextInt();
		
		boolean isValid = false;
		
		for (int i = 2; i <= n/2; ++i)
		{
			if (n % i == 0)
			{
				isValid = true;
				break;
			}
		}

		if (!isValid)
		{
			System.out.println(n + " is a prime number!");
		}
		else
		{
			System.out.println(n + " is not a prime number!");
		}
	}
}



