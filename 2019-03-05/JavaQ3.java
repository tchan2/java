import java.lang.Math;
public class JavaQ3 {

	public static void main(String[] args) {
		double sum = 0;
		
		for (int i = 1; i <= 10000; i++)
		{
			sum += 2*((Math.pow((-1), i+1))/ ((2*i)-1));
		}
		System.out.println("The sum is " + sum);

	}
}
