package day11;

public class InRange {
	// To generate main method
	// main -> Ctr + Space + Enter
	
	public static void main(String[] args) {
		// to generate print statement
		// sysout -> Ctr + Space
		
		// range: 10 - 20	
		System.out.println(inRange(9)); // false
		System.out.println(inRange(10)); // true
		System.out.println(inRange(15)); // true
		System.out.println(inRange(20)); // true
		System.out.println(inRange(25)); // false
		System.out.println(inRange(100)); // false
 	}
	
	// TODO: if number within the range from 10 to 20 inclusive return true
	//       otherwise return false
	// Logical AND - &&
	// Logical OR  - ||
	// Logical NOT - !
	public static boolean inRange(int number) {
		//        true   AND   true
		if (number >= 10 && number <= 20) {
			return true;
		} 

		return false;
	}
}