package test3;

public class HW030 {
	public static void main(String[] args) {
		boolean res = endOther("Hiabc", "abc");
		System.out.println(res);
	}

	public static boolean endOther(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();

		if (lenB >= lenA) {
			return b.substring(lenB - lenA, lenB).equalsIgnoreCase(a);
		}else{
			return a.substring(lenA - lenB, lenA).equalsIgnoreCase(b);
		}
	}
}
