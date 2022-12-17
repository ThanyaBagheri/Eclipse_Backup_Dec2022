package day10;

public class Project {
	public static void main(String[] args) {
		//int amount = Integer.parseInt(args[0]);
		int amount = 87;
		System.out.println(amount + " cents in coins:");
		
		int quarters = amount / 25;
		amount = amount % 25;
		
		int dimes = amount / 10;
		amount = amount % 10;
				
		int nikles = amount / 5;
				
		int pennies = amount % 5;
			
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nikles + " nikles");
		System.out.println(pennies + " pennies");
	}
}
