package day23;

public class WarmUpTwo {
	public static void main(String[] args) {
		printLetters("hello world");
		System.out.println("-----");
		
		printRevLetters("Java");
	}
	
	/*
	 * prints each letter from str in reverse order
	 * printRevLetters("abc")
	 * c
	 * b
	 * a
	 *                  
	 * printRevLetters("java")
	 * a
	 * v
	 * a
	 * j
	 */
	
	public static void printRevLetters(String str) {
		for (int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.println(ch);
			
		}
}
	/*
	 * prints each letter of str in the new lines
	 * 
	 * printLetters("apple");
	 * a
	 * p
	 * p
	 * l
	 * e
	 */
	public static void printLetters(String str) {
		for (int i = 0; i <= str.length()-1; i++) {
			System.out.println(str.charAt(i));
		}
	}
}
