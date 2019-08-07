import java.util.*;

public class Circle
{
	public static void main(String []args)
	{
    	int radius;
    	double area;
    	double pi = 3.14;
   	 
    	Scanner input = new Scanner (System.in);
    	System.out.print("Please enter your radius: ");
 		radius = input.nextInt();
 		 
 		area = radius * radius * pi;

 		System.out.println("The area of the circle is: " + area);
	}
}
