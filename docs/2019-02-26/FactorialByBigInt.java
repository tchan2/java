import java.math.BigInteger;

public class FactorialByBigInt {
	static BigInteger myBigFactorial(int N)
	{
		BigInteger fact = new BigInteger("1"); //base point
		
		// Do factorial
		for (int i = 2; i<= N; i++)
			fact = fact.multiply(BigInteger.valueOf(i));
		return fact;
	}

	public static void main(String[] args) {
		int N = 1000;
		System.out.println("Checking factorial under BigInt: \n");
		System.out.println(myBigFactorial(N));

	}

}
