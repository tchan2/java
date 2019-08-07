import java.util.*;

public class MatrixOperations {

	public static void main(String[] args) 
	{
		double[][] a = { {2, -9, 2}, {1.9, 0.3, 100}, {-1.0, 2, 5} };
		double[][] b = { {100, 20, -1.6}, {900.2, 20.3, 3.8}, {100, 21.5, -17} };
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome! Here are your two matrices!");
		output(a);
		output(b);
		
		System.out.println("You can do one of the following: ");
		System.out.println(" 1) Sum\n 2) Difference\n 3) Product\n 4) Scalar Product \n"
						 + " 5) a^3 - b^3 \n 6) 2a^2 + 3b^2 \n 7) Sort matrix of your choice \n");
		
		System.out.println("Input the number of the choice you would like to see: ");
		String choice = input.next();
		
		double[][] sum = addMatrix(a, b);
		double[][] diff = subtractMatrix(a, b);
		double[][] prod = multiplyMatrix(a, b);
		double[][] cubedEq = cubedEqMatrix(a, b);
		double[][] sqrEq = sqrEqMatrix(a, b);
		double[][] res = new double[a.length][];
		
		if (choice.equals("1"))
		{
			System.out.println("\nThe sum of these two matrices are: ");
			output(sum);
		}
		
		else if (choice.equals("2"))
		{
			System.out.println("\nThe difference of these two matrices are: ");
			output(diff);
		}
		
		else if (choice.equals("3"))
		{
			System.out.println("\nThe product of these two matrices are: ");
			output(prod);
		}
		
		else if (choice.equals("4"))
		{
			Scanner val = new Scanner(System.in);
			System.out.println("\nYou have chosen to find the scalar product of these matrices.");
			System.out.println("What number would you like to multiply? ");
			double n = val.nextDouble();
			
			double[][] c = scalarProduct(a, n);
			System.out.println("\nThis is the scalar product of matrix a with value " + n + ":");
			output(c);
			
			double[][] d = scalarProduct(b, n);
			System.out.println("\nThis is the scalar product of matrix b with value " + n + ":");
			output(d);
		}
		
		else if (choice.equals("5")) 
		{
			System.out.println("\nThe result of the a^3 - b^3 sorted matrix is: ");
			output(cubedEq);
		}
		
		else if (choice.equals("6")) 
		{
			System.out.println("\nThe result of the 2a^2 + 3b^2 sorted matrix is: ");
			output(sqrEq);
		}
		
		else if (choice.equals("7")) 
		{
			Scanner x = new Scanner(System.in);
			System.out.println("\nYou can sort one of the following matrices: ");
			System.out.println(" 1) Sum \n 2) Difference \n 3) Product\n"
							 + " 4) a^3 - b^3 \n 5) 2a^2 + 3b^2 \n ");
			
			System.out.println("\nInput the number of the matrix you would like to sort: ");
			int n = x.nextInt();
					
			if (n == 1)
			{
				res = sortMatrix(sum);
				System.out.println("\nThe sorted sum matrix: ");
				output(res);
			}
			
			else if (n == 2)
			{
				res = sortMatrix(diff);
				System.out.println("\nThe sorted difference matrix: ");
				output(res);
			}
			
			else if (n == 3)
			{
				res = sortMatrix(prod);
				System.out.println("\nThe sorted product matrix: ");
				output(res);
			}
			
			else if (n == 4)
			{
				res = sortMatrix(cubedEq);
				System.out.println("\nThe sorted a^3 - b^3 matrix: ");
				output(res);
			}
			
			else if (n == 5)
			{
				res = sortMatrix(sqrEq);
				System.out.println("\nThe sorted 2a^2 + 3b^2 matrix: ");
				output(res);
			}
		}
		
		else
		{
			System.out.println("\nInvalid output! Please input either sum, difference, product, or scalar product!");
		}
		
	}

	public static double[][] addMatrix (double[][] a, double[][] b)
	{
		double[][] c = new double[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				for (int k = 0; k < b[0].length; k++)
						c[i][j] = a[i][j] + b[i][j];						
		
		return c;	
	}
	
	public static double[][] subtractMatrix (double[][] a, double[][] b)
	{
		double[][] c = new double[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				for (int k = 0; k < b[0].length; k++)
					c[i][j] = b[i][j] - a[i][j];
		return c;
	}
	
	public static double[][] multiplyMatrix (double[][] a, double[][] b)
	{
		double[][] c = new double[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				for (int k = 0; k < b[0].length; k++)
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
		
		return c;
	}
	
	public static double[][] scalarProduct (double[][] a, double val)
	{
		double[][] c = new double[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				c[i][j] = a[i][j] * val;
		}

		return c;
	}
	
	public static double[][] cubedEqMatrix (double[][] a, double [][] b)
	{
		double[][] c = new double[a.length][a[0].length];
		double[][] d = new double[b.length][b[0].length];
		double[][] res = new double[a.length][b[0].length];
		
		c = multiplyMatrix(a, a);
		c = multiplyMatrix(c, a);
		
		d = multiplyMatrix(b, b);
		d = multiplyMatrix(c, b);
		
		res = subtractMatrix(c, d);
		return res;
	}
	
	public static double[][] sqrEqMatrix (double[][] a, double [][] b)
	{
		double[][] c = new double[a.length][a[0].length];
		double[][] d = new double[b.length][b[0].length];
		double[][] res = new double[a.length][b[0].length];
		
		c = multiplyMatrix(a, a);
		c = scalarProduct(c, 2);
		
		d = multiplyMatrix(b, b);
		d = scalarProduct(d, 3);
		
		res = addMatrix(c, d);
		return res;
	}
	
	public static double[][] sortMatrix (double[][] m) 
	{
		double[] temp = new double[m.length * m[0].length];
		int counter = 0;
		
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				temp[counter++] = m[i][j];
		
		Arrays.sort(temp);
		
		counter = 0;
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				m[i][j] = temp[counter++];

		return m;
	}
	
	public static void output (double[][] product)
	{
		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product[0].length; j++) 
			{
				System.out.print(String.format("%20s", product[i][j]));
			}
			System.out.println("");
		}
		System.out.println("");
	}

}