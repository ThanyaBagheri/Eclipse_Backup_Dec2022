package day48;

public class ExceptionTaskOne {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str);
		
		// TODO handle exception from line 8 and print "str was null"
		// By using try catch statement
		try {
			str = str.toLowerCase();
			
		} catch(NullPointerException e) {
			System.out.println("str was null");
		}
		System.out.println(str);
	}
}
