package day05;

public class Egg {
	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		
		numberOfBaskets = 10;
		eggsPerBasket = 6;
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("if you have");
		System.out.println(numberOfBaskets + " basket, and");
		System.out.println(eggsPerBasket + " eggs per basket, then");
		System.out.println("the total number of eggs is " + totalEggs);
	}
}
