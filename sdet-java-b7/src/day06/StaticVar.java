package day06;

public class StaticVar {
	public static String name = "John Doe1";
	public static int age = 25;
	
	public static void test11(int age2) {
		//String firstName = "Alex";
		System.out.println(age+1);

	}
	
	
	public static void main(String[] args) {
		/*
		 * Static variables are global variables.
		 * They belong to class itself not to specific object.
		 */
		
		//System.out.println(name);
		//System.out.println(age);
		
		age = 27;
		//System.out.println(name);
		//System.out.println(age);
		test11(age);
		
	}

	
}
