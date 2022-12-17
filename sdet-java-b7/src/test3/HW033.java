package test3;

public class HW033 {
	public static void main(String[] args) {
		boolean res = xyBalance("12xabxxydxyxyzz");
		System.out.println(res);
	}

	public static boolean xyBalance(String str) {
		if (str.length() == 1 && str.equals("x")) {
			return false;
		}

		int indexX = 0;
		int indexY = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				indexX += i;
			}
		}
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 'y') {
				indexY += j;
			}
		}
		if (indexX <= indexY) {
			return true;

		}
		return false;
	}
}
