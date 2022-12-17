package day22;

public class BreakAndContinueTwo {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 15; i++) {
			// skip 7,9,13
			if (i==7 || i==9 || i == 13) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
