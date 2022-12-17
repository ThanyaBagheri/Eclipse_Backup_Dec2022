package test;

public class HW006 {
	public static void main(String[] args) {
		System.out.println(min(90, 9, 39));
	}

	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			} else
				return c;
		} else {
			if (b < c) {
				return b;
			} else
				return c;
		}
	}
}
