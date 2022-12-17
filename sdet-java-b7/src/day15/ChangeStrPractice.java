package day15;

public class ChangeStrPractice {
	public static void main(String[] args) {
		System.out.println(changeStr("Abc")); // abc
		System.out.println(changeStr("Beknazar")); // BEKNAZAR
		System.out.println(changeStr("John Doe")); // JOHN DOE
		System.out.println(changeStr("JAVA")); // java
		System.out.println(changeStr("java")); // java
	}

	/*
	 * if str argument length is greater than 5 return it all in upper cases
	 * otherwise return it in all lower cases - length() - if else - toUpperCase() -
	 * toLowerCase()
	 */

	public static String changeStr(String str) {

		int strn = str.length();

		//if (strn > 5) {
		//	return str.toUpperCase();
		//} else {
		//	return str.toLowerCase();

		return str = strn > 5? str.toUpperCase() : str.toLowerCase();
		
	}
}
