package day43;

public class SDET extends Employee {
	public String project;
	
	public static void main(String[] args) {
		SDET sdet = new SDET();		
		sdet.firstName = "John";
		sdet.lastName = "Doe";
		sdet.empId = 1;
		sdet.salary = 90000;
		sdet.department = "IT";
		
		String fullName = sdet.getFullName();
		System.out.println(fullName);
	}
}
