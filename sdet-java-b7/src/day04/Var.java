package day04;

public class Var {
	public static void main(String[] args) {
		// variable declaration
		String firstName;   
		// String - data type
		// firstName - -name of variable 
		
		firstName = "John";
		//assigning value for firstName as "John"
		
		System.out.println(firstName); 
		
		firstName = "Smith";
		System.out.println(firstName);
		
		// declare multiple variables in the same statement
		String studentName, StudentCourse;
		studentName = "Alex";
		StudentCourse = "Java";
		System.out.println(studentName);
		System.out.println(StudentCourse);
		
		// declare and assign value in the same statement
		String lastName = "Doe"; 
		System.out.println(lastName);
		
		String address = "101 Main st", city = "aldie", state = "VA";
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);	
	}
}
