package day23;

public class StrReversePractice {
	public static void main(String[] args) {
		System.out.println(revStr("apple")); // elppa
		System.out.println(revStr("abc")); // cba
		System.out.println(revStr("hello world")); // dlrow
	}

	public static String revStr(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
}
