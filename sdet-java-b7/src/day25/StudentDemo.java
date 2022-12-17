package day25;

public class StudentDemo {
	public static void main(String[] args) {
		
		Student studentZero = new Student();
		studentZero.firstName = "Moe";
		studentZero.lastName = "Bagheri";
		studentZero.grade = 95;
		
		Student studentOne = new Student("Prim","Saengsing",100);
		
		studentZero.display();
		studentOne.display();
	}
}
