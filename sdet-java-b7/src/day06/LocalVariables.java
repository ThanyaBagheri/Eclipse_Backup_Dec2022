package day06;

public class LocalVariables {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		int age = 35;

		int number;
	
		//System.out.print(number); //doesn't compile		
		// local variables cannot be used before initialization (they don't have default values)
		
		if (age > 10) {
			String str = "apple";
			System.out.println(str);
		}
		
		// System.out.println(str);
	
	}
	
	public void test() {
		String firstName = "Alex";
		System.out.println(firstName);
		
	}
	
}
