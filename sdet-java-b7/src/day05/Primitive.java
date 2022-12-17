package day05;

public class Primitive {
	public static void main(String[] args) {
		// Primitives are core data types in Java.
		// There are 8 primitives
		// 1. Primitives for whole numbers: byte, short, int, long
		// 2. Primitives for floating numbers: float, double
		// 3. Primitive for single characters: char
		// 4. Primitive for logical value: boolean
		
		// int age = 5;
		
		byte bNum = 10;
		short shNum = 100;
		int num = 3400;
		long lNum2 = 2355235234L;
		// literal value type for whole number is int
		// and we put L(or l) for the long value to tell compiler 
		// it is a long not int.
		
		float fNum = 9.9F;
		double dNum = 23424.53;
		// the default type for literal floating numbers is double
		// we need to put F(or f) after the float value to tell compiler
		// it is float not double
		
		// char represents single characters in Java
		// the value should go between single quotes
		char letter = 'A';
		System.out.println(letter);
		// each char will have a numeric value from ACII table
		System.out.println((int)letter);
		
		// boolean is a data type to store logical values
		// it can be true or false only
		boolean isBreakTime = true;
		System.out.println(isBreakTime);
	}
}
