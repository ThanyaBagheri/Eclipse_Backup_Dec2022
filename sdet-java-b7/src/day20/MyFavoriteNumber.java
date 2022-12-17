package day20;

import util.InputFromUser;

public class MyFavoriteNumber {
	public static final int MY_FAVORITE_NUMBER = 7;
	
	public static void main(String[] args) {
		
		String strNumber = InputFromUser.getInput("Enter my favorite number:");
		int favoriteNumber = Integer.parseInt(strNumber);
		
		
	
		//	if (MY_FAVORITE_NUMBER == favoriteNumber) {
		//	System.out.println("Congrats!");
		//}else {
		//	System.out.println("Incorrect, try again");
		
		while (favoriteNumber != MY_FAVORITE_NUMBER) {
			System.out.println("Incorrect, try again");
			
			strNumber = InputFromUser.getInput("Enter my favorite number:");
			favoriteNumber = Integer.parseInt(strNumber);
		}
		System.out.println("Congrats!");	
	}
}

