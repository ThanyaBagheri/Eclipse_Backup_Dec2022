package day06;

public class InstanceVar {
	public String firstName;
	public String lastName;
	public int age;
	
	
	public static void main(String[] args) {
		/*
		 * Instance Variables
		 * 1.They are properties of objects, to use it, we need to create an object out of this class
		 * 2. We cannot call them directly in our main method
		 * 
		 */
		
		// System.out.println(firstName);
	
		InstanceVar obj = new InstanceVar();
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 25;
		}
	

		
	}
		
		
		
	


