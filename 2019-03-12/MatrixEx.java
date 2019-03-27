
public class MatrixEx {
	public static void main(String[] args) {
		char[][] answers = {
		{'A', 'B', 'A', 'C', 'C', 'D', 'A', 'E', 'A', 'D'},
		{'D', 'B', 'A', 'B', 'C', 'A', 'A', 'E', 'A', 'D'},
		{'E', 'D', 'D', 'A', 'C', 'B', 'A', 'E', 'A', 'D'},
		{'C', 'B', 'A', 'E', 'D', 'C', 'C', 'E', 'A', 'B'},
		{'A', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'},
		{'B', 'B', 'E', 'C', 'C', 'D', 'A', 'E', 'A', 'D'},
		{'B', 'B', 'A', 'C', 'C', 'D', 'A', 'E', 'A', 'D'},
		{'E', 'B', 'E', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}};
		
		char[] ans = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == ans[j])
					correctCount++;
			}
			System.out.println("Student " + i + "'s correct count is " + correctCount);
		}
		
		double[][] matrix = new double[3][4];
		int x = 0;
		
		System.out.println(sumColumn(matrix, x));
		
				
	}
	
	public static double sumColumn(double [][] m, int columnIndex)
	{
		double total = 0;
		for (int row = 0; row < m.length; row++) {
			for (columnIndex = 0; columnIndex < m[row].length; columnIndex++)
			{
				total += m[row][columnIndex];
			}
		}
		return total;
	}
}
