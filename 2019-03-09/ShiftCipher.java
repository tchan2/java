import java.util.Scanner;

public class ShiftCipher {
	
    public static void main(String[] args) {
    	// Input a string.
    	Scanner input = new Scanner(System.in);
    	System.out.print("Please input a string to encrypt: ");
    	String s = input.nextLine();
    	
    	// Input shift key.
    	System.out.print("Enter an integer for your shift cipher key: ");
    	int shiftKey = input.nextInt();
    	
    	// Convert and output.
    	int[] asciiString = stringToASCII(s);
    	int[] encryptedMes = encrypted(asciiString, shiftKey);
    	System.out.println("\nEncrypted message: ");
    	output(encryptedMes);
    	
    	System.out.println("");
    	int[] decryptedMes = decrypted(encryptedMes, shiftKey);
    	System.out.println("\nDecrypted message: ");
    	output(decryptedMes);
    }
    
    public static int[] stringToASCII(String s) 
    {
    	int[] a = new int[s.length()];
    	
    	for (int i = 0; i < s.length(); i++)
    		a[i] = (int)s.charAt(i);
    	
   	 	return a;
    }
    
    public static int[] encrypted(int[] a, int k) 
    {
   	 	int shiftNum = k % 94;
   	 	for (int i = 0; i < a.length; i++) 
   	 	{
   	 		if (a[i] + shiftNum > 126) 
   	 		{
   	 			int overSum = a[i] + shiftNum;
   	 			int newShift = overSum - 126;
   	 			a[i] = 32 + newShift;
   	 		}
   	 		else
   	 			a[i] += shiftNum;
   	 	}
   	 	return a;
    }
    
    public static int[] decrypted(int[] a, int k) 
    {
   	 	int shiftNum = k % 94;
   	 	for(int i = 0; i < a.length; i++) 
   	 	{
   	 		if (a[i] - shiftNum < 32) 
   	 		{
   	 			int tempShift = 32 - (a[i] - shiftNum);
   	 			a[i] = 126 - tempShift;
   	 		}
   	 		else
   	 			a[i] = a[i] - shiftNum;
   	 	}
   	 	return a;
    }
    
    public static void output(int[] a) 
    {
   	 	for (int i = 0; i < a.length; i++) 
   	 	{
   	 		System.out.print((char)a[i]);
   	 	}
    }
}
