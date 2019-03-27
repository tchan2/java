// Tammy Chan

import java.io.File;
import java.util.*;

public class FSA {
	
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter which data you would like to use: ");
		String data = input.next();
			
		File file0 = new File ("C:\\Users\\tchan\\theory-comp\\proj1\\data0");
		File file1 = new File ("C:\\Users\\tchan\\theory-comp\\proj1\\data1");
		
		if (data.equals("data0"))
		{	
			useData(file0);
		}
		
		if (data.equals("data1"))
		{	
			useData(file1);
		}	
	}
	
	public static void useData(File f) throws Exception
	{
		Scanner sc = new Scanner(f);
		sc.useDelimiter("\\Z");
		
		String alphabet = sc.nextLine();
		String numofStates = sc.nextLine();
		String startState = sc.nextLine();
		
		// Split the states to only take the second -> last for accepting states
		String states = sc.nextLine();		
		String[] splitStates = states.split(" ");
		
		String[] acceptedStates = Arrays.copyOfRange(splitStates, 1, splitStates.length);
		
		// Take next lines and put them into string to create matrix
		String allStates = " ";
	
		while (sc.hasNextLine())
		{
			String temp = sc.nextLine();
			allStates += temp + " ";
		}
		
		String[] stringStates = allStates.split(" ");
			
		int matrixSize = (int) Math.sqrt(stringStates.length);
		String[][] stateMatrix = new String[matrixSize][matrixSize];
		
		for (int i = 0; i < matrixSize; ++i) 
		{
			stringStates[i] = stringStates[i].trim();
			for (int j = 0; j < matrixSize; j++)
			{
				stateMatrix[i][j] = stringStates[j];
				j++;
			}
		}
		
		// Takes input
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the string you would like to test: ");
		String testString = input.next();
		
		// Checks if alphabet in input matches the ones given in file. If it 
		// does, then go to correct place in matrix, and put that value in.
		Integer startNum = Integer.parseInt(startState);
		ArrayList<String> checkString = new ArrayList<String>();
		char a = 0;
		char b = 0;
		
		for (int i = 0; i < testString.length(); ++i)
		{
			char c = testString.charAt(i);
			if (alphabet.indexOf(c) >= 0)
			{
				if (testString.charAt(i) == a) 
				{
					String value = stateMatrix[startNum][1];
					checkString.add(value);
					startNum = Integer.parseInt(value);
				}
				else if (testString.charAt(i) == b)
				{
					String value = stateMatrix[startNum][2];
					checkString.add(value);
					startNum = Integer.parseInt(value);
				}
			}
		}
		
		// Check if accepted by getting last element of checkString
		String lastState = checkString.get(checkString.size() - 1);
		
		if (Arrays.asList(acceptedStates).contains(lastState))
			System.out.print("Accepted!");
		else
			System.out.print("Not accepted!");
	}
}
