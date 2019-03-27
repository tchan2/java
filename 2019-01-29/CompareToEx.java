
public class CompareToEx {

	public static void main(String[] args) {
		String s1 = "Hello";
		String lowerS1 = s1.toLowerCase();
		String s2 = "hello";
		
		if (s1.compareTo(s2) == 0)
			System.out.println("They are equal!");
		else
			System.out.println("They are not equal!");

	}

}
