import java.util.Scanner;

public class distanceMatrix {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number for matrix: ");
		
		int num;
		
		double matrix[][] = new double[num][2];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = input.nextDouble();
			matrix[i][1] = input.nextDouble();
		}
		
		int p1=0, p2=1;
		double shortestDistance = distance(matrix[p1][0], matrix[p1][1], matrix[p2][0], matrix[p2][1]);
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i+1; j < matrix.length; j++)
			{
//				double distance = (matrix[i][0], matrix[i][1], matrix[j][0], matrix[j][1]);
				double distance = 0;
				
				if (shortestDistance > distance)
				{
					p1 = i;
					p2 = j;
					shortestDistance = distance;
				}
			}
		}
		
		
 	}

	private static double distance(double d, double e, double f, double g) {
		// TODO Auto-generated method stub
		return 0;
	}

}
