package day25;

public class Student {
	public String firstName;
	public String lastName;
	public double grade;
	
	public Student() {
		
	}
	
	public Student(String firstName, String lastName, double grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("FirstName: "+this.firstName);
		System.out.println("LastName: "+this.lastName);
		System.out.println("Grade: "+this.grade);
		System.out.println();
	
	}
}
