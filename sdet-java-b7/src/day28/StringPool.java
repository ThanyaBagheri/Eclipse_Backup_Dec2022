package day28;

public class StringPool {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = "apple";
		
		// String Pool is special memory for a string
		// that reuses the object with content.
		String str2 = new String("apple");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		// What does == do when used with object references?
		// If two references are pointing to the same object or not
		
		System.out.println(str == str1); // true, yes they are
		System.out.println(str == str2); // false, no they are not
		System.out.println(str.equals(str2)); // true, because content is same

		// What's the output and why?
	}
}
