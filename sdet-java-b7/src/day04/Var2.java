package day04;

public class Var2 {
	public static void main(String[] args) {
		
		String firstName = "John";
		String lastName = "Doe";
		// JohnDoe
		System.out.println(firstName + lastName);
		// John Doe
		System.out.println(firstName + " " + lastName);
		
		
		// John Doe
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
	}
}
