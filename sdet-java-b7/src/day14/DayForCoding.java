package day14;

import java.util.Random;

public class DayForCoding {
	public static void main(String[] args) {
		Random r = new Random();
		int dayOfWeek = r.nextInt(7); // 0-6
		// System.out.println("Day to code: " + dayOfWeek);

		switch (dayOfWeek) {
		case 0:
			System.out.println("Sun");
			break;
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wen");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		default:
			System.out.println("Unknow number: " + dayOfWeek);
		}
	}
}
