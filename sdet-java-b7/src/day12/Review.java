package day12;

public class Review {
	public static void main(String[] args) {
		saySomething("Good morning!");
		saySomething("Hello class!");
		
		String myInputStr = "Java Day 12";
		saySomething(myInputStr);
		
		String resStr = formatInfo("John Doe", 40);
		System.out.println(resStr);
		
		System.out.println(formatInfo("Alex", 37));
	}
	
	// numbers bigger than 1000 is big number
	public static boolean isBigNumber(int num) {
		if (num > 1000) {
			return true;
		}
		
		return false;
	}
	
	public static String formatInfo(String name, int age) {
		String res = "name: " + name + ", age: " + age;
		return res; // when we return, we exit from the method
	}
	
	public static void saySomething(String str) {
		System.out.println("I'm saying " + str);
	}
}
