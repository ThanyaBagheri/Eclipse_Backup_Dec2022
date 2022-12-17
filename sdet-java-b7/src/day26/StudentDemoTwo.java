package day26;

public class StudentDemoTwo {
	public static void main(String[] args) {
		Student s = new Student();
		s.firstName = "Junjun";
		System.out.println(s.firstName);
		System.out.println(s.lastName);
		System.out.println(s.course);
		System.out.println(s.grade);
		
		System.out.println("---");
		Student sOne = new Student("Abby", "Sui", "B4", 85.1);
		sOne.printDetails();
	}
}

// TODO
// what's the output from this program?
// send me in direct slack message whole output
