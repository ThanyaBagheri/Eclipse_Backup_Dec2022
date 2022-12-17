package day22;

public class StrReverse {
	public static void main(String[] args) {
		System.out.println(revStr("apple")); // elppa
		System.out.println(revStr("hello")); // olleh
		System.out.println(revStr("abc")); // cba
	}
	
	/*
	 * Reverse argument str and return it
	 * 
	 * revStr("apple") -> elppa
	 * revStr("hello") -> olleh
	 * revStr("abc")   -> cba
	 */
	public static String revStr(String str) {
		String res = "";
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			char ch = str.charAt(i);
			res = res + ch;
		//  res += ch;	
		}
		return res;
	}
}
