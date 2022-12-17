package day23;

import util.InputFromUser;

public class Pyramid {
	/*
	 * Ask from user number as input and print pyramid based on this number
	 * 
	 * enter number:
	 * 3
	 * #
	 * ##
	 * ###
	 * 
	 * 5
	 * #
	 * ##
	 * ###
	 * ####
	 * #####
	 */
	
	
	
	public static void main(String[] args) {
		String intputStr = InputFromUser.getInput("Enter number:");
		int pyramidLevel = Integer.parseInt(intputStr);

		
		String hash = "#";
		String pyramidDisplay = hash;		
		
		for (int i = 0; i <pyramidLevel ; i++) {
			
			System.out.println(pyramidDisplay);
			pyramidDisplay = pyramidDisplay + hash;
		}
	}
}
