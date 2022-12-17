package day26;

public class Student {
	// class is a blueprint for objects

	// TODO
	// Make changes so StudentDemo class
	// starts working
	// 1. Create constructor with 4 arguments
//	    assign values of properties inside
	// 2. Create empty constructor

	public String firstName;
	public String lastName;
	public String course;
	public double grade;

	public Student() {
		System.out.println("empty constructor is called");
	}
	
	public Student(String firstName,String lastName, String course, double grade) {
		System.out.println("4 argument constuctor is called");
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;

	}
	
	public void printDetails() {
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.course);
		System.out.println(this.grade);
	}
}
