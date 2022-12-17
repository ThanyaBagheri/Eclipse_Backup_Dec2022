package test3;

public class HW034 {
	public static void main(String[] args) {
		boolean res = xyBalance("yxyx");
		System.out.println(res);
	}

	public static boolean xyBalance(String str) {
		int placeX = 0;
		int placeY = 0;

		for (char i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				placeX += i;
				for (char j = 0; j < str.length(); j++) {
					if (str.charAt(j) == 'y') {
						placeY += j;
					}
				}
			}
		}
		if (placeX < placeY) {
			return true;
		}
		return false;

	}
}