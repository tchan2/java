public class TestIncrement {

	public static void main(String[] args) {
		
		int m = 4;
		int result = 3 * (++m);
		
		// Display result
		System.out.println("Result has a value of " + result + " and m has the value of " + m + ".");
		
		int n = 4;
		int res = 3 * (n++);
		
		// Display result
		System.out.println("Result has a value of " + res + " and m has the value of " + n + ".");

	}

}
