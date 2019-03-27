
public class LoopComputation {

	public static void main(String[] args) {
		int sum = 0;
		int mean = 0;
		double sum2 = 0;
		
		for (int i = 1; i < 10001; i++)
		{
			sum += i;
			mean = sum/i;
			sum2 += 1/i;
		}
		
		System.out.println("The sum is: " + sum);	
		System.out.println("The mean is: " + mean);
		System.out.println("The sum of 1+1/2+1/3... is: " + sum2);
	}

}
