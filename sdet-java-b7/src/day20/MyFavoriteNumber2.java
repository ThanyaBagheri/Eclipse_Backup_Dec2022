package day20;

import util.InputFromUser;

public class MyFavoriteNumber2 {
	public static final int MY_FAVORITE_NUMBER = 7;
	
	
	public static void main(String[] args) {
		
		int inputNumber;
		
		do {
			String strNumber = InputFromUser.getInput("Enter my favorite number:");
			inputNumber = Integer.parseInt(strNumber);
			
		} while (inputNumber != MY_FAVORITE_NUMBER );
		
	    System.out.println("Congrats!");		
	} 
}
