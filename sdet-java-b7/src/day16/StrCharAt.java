package day16;

public class StrCharAt {
	public static void main(String[] args) {
		//CharAt(int index) gets specific char by index
		
		String str = "home";
		
		char ch = str.charAt(1);
		
		System.out.println(ch);
		System.out.println(str);
	
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(0));
		
		// Runtime exception - StringIndexOutOfBoundsException: String index out of range: 4
		// System.out.println(str.charAt(4)); 
}
}
