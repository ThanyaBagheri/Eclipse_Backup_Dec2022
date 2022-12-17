package day19;

public class DisplayScore {
	enum Grade {
		A, B, C, F
	}

	public static void main(String[] args) {
		displayScore(Grade.A);
		displayScore(Grade.B);
		displayScore(Grade.C);
		displayScore(Grade.F);
	}

	public static void displayScore(Grade grade) {
		if (grade == Grade.A) {
			System.out.println("90-100");
		} else if (grade == Grade.B) {
			System.out.println("65-89");
		} else if (grade == Grade.C) {
			System.out.println("50-64");
		} else if (grade == Grade.F) {
			System.out.println("less than 49");
		} else {
			System.out.println("Undefined grade:" + grade);
		}
	}
}
