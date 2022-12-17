package day06;

public class StudentConstance {
	// Constantly apply
	public static final double PERCENTAGE = 8.0;
	
	public static void main(String[] args) {
		String name = "John Doe";
		double grade = 100.0;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
		double percentToAdd = grade * PERCENTAGE / 100;
		grade = grade + percentToAdd;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);				
	}
}
