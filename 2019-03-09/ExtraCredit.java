import java.math.BigInteger;

public class ExtraCredit {

	public static void main(String[] args) {
		BigInteger ten = BigInteger.TEN;
   	 
    	BigInteger lowLim = ten.pow(8);
    	BigInteger uppLim = ten.pow(9);
   	 
    	System.out.print("Finding prime numbers between " +  lowLim + " and " + uppLim  + "!\n");
    	System.out.println(" ");
   	 
    	findPrime(lowLim, uppLim);
   	 
    	System.out.println("Done!\n");
	}
    
	public static void findPrime(BigInteger lowLim, BigInteger uppLim) 
	{ 	 	
    	boolean isPrime;
    	int count = 1;
   	 
    	for(; lowLim.compareTo(uppLim) < 0; lowLim = lowLim.add(BigInteger.ONE)) 
    	{
        	isPrime = lowLim.isProbablePrime(100);
       	 
        	if (isPrime) 
        	{
            	if (count % 8 != 0)
            	System.out.print(lowLim + " ");
           	 
            	else
            	System.out.println(lowLim + " ");
           	 
            	
            	count++;
        	}
    	}
	}
}
