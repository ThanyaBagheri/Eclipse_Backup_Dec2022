package test;

public class HM003 {
	public static void main (String[] args) {
		double mySalary = 8;
		System.out.println("Salary: " + mySalary);
		
		mySalary = x10(mySalary);
		System.out.println("New Salary: " + mySalary);
		
      }
	
	public static double x10(double salary) {
		salary = salary *10;
		return salary;
	}
  }

