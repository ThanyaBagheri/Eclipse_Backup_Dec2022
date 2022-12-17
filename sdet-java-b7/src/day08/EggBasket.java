package day08;

import util.InputFromUser;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		String strNumberOfBaskets = InputFromUser.getInput("Enter number of Baskets");
		String streggsPerBasket = InputFromUser.getInput("Enter number of eggs");
		
		numberOfBaskets = Integer.parseInt(strNumberOfBaskets);
		eggsPerBasket = Integer.parseInt(streggsPerBasket);
		
		//numberOfBaskets = 10;
		//eggsPerBasket = 6;
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("if you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("The total number of eggs is " + totalEggs);
	
	}
}
