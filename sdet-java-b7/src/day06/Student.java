package day06;

public class Student {
	public static void main(String[] args) {
		String name = "Prim";
		double grade = 10;
		
		//grade = (grade*8)/100 + grade;
		grade = grade + grade*0.08;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);		
	}
}
