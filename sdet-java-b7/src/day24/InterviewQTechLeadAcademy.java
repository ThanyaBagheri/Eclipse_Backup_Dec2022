package day24;

public class InterviewQTechLeadAcademy {
	public static void main(String[] args) {
		/*
		 * Print number from 1 to 100 inclusive in new lines -if a number is divisible
		 * by 3 evenly, print Tech -if a number is divisible by 5 evenly, print Lead -if
		 * a number is divisible by 3 and 5 evenly, print TechLeadAcademy
		 */

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("TechLeadAcademy");
			} else if (i % 5 == 0) {
				System.out.println("Lead");
			} else if (i % 3 == 0) {
				System.out.println("Tech");
			} else {
				System.out.println(i);
			}

		}

	}
}
