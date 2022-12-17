package project;

public class project4 {

	public static void main(String[] args) {
		makePyramid(5);
	}

	public static void makePyramid(int num) {
		if (num > 8 || num < 1) {
			System.out.println("INVALID INPUT");
			return; // exit the method
		}

		StringBuilder pyramidRow = new StringBuilder("#");
		String spaces = repeatStr(" ", num);

		for (int i = 0; i < num; i++) {
			spaces = spaces.substring(0, spaces.length() - 1);
			System.out.println(spaces + pyramidRow + "  " + pyramidRow);
			pyramidRow.append("#");
		}
	}

	public static String repeatStr(String str, int repeattime) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repeattime; i++) {
			sb.append(str);
		}
		return sb.toString();
	}
}
