package test2;

public class HW025 {
	public static void main(String[] args) {
		String res = doubleChar("The");
		System.out.println(res);
	}

	public static String doubleChar(String str) {
		String db = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			db = db + ch + ch;

		}
		return db;
	}
}
