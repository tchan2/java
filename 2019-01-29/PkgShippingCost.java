import java.util.Scanner;

public class PkgShippingCost {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter a weight: ");
		double weight = input.nextDouble();
		
		if (weight <= 1 && weight >= 0)
			System.out.println("The shipping cost is $3.50.");
		else if (weight <= 3 && weight >= 1)
			System.out.println("The shipping cost is $5.50.");
		else if (weight <= 10 && weight >= 3)
			System.out.println("The shipping cost is $8.50.");
		else if (weight <= 20 && weight >= 10)
			System.out.println("The shipping cost is $10.50.");
		else 
			System.out.println("The shipping cost is unavailable.");

	}

}
