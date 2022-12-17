package day23;

import util.InputFromUser;

public class PyramidTwo {
	public static void main(String[] args) {
		String intputStr = InputFromUser.getInput("Enter number:");
		int pyramidLevel = Integer.parseInt(intputStr);
		
		String hash = "#";
		for (int i=0; i< pyramidLevel; i++) {
			for (int j = 0; j<=i; j++) {
			System.out.print(hash);
			}
		System.out.println();
		}
	}
}
