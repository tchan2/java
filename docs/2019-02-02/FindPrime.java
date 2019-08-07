import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String primeNums = " ";
		int count = 0;
		
		for (int i = 1000; i < 3000; i++) 
		{
			int counter = 0;
			boolean isPrime = true;
			
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					isPrime = false;
					counter = counter + 1;
					break;
				}
			}
			if (isPrime) 
			{
				System.out.print(i + " ");
				count++;
				
				if (count == 5)
				{
					System.out.println();
					count = 0;
				}
				
			}
			primeNums = primeNums + i + " ";
		}
	}
}
