import java.util.Scanner;

public class Circumference {

	public static void main(String []args)
	{
    	double radius;
    	double circumference;
    	double pi = 3.14;
   	 
    	Scanner input = new Scanner (System.in);
    	System.out.print("Please enter your radius: ");
 		radius = input.nextDouble();
 		 
 		circumference = (radius + radius) * pi;

 		System.out.println("The circumference of the circle is: " + circumference);
	}

}
