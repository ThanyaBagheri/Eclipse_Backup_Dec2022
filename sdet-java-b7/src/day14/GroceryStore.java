package day14;

import util.InputFromUser;

public class GroceryStore {
	
	public static void main(String[] args) {
		/*
		 * bread - 4.99
		 * water - 2.99
		 * apple - 1.5
		 * red bull -> 2.59
		 */
		
		String item = InputFromUser.getInput("Enter item name:");
		double price = 0.0;
		
		// What data types switch support?
		// byte and Byte
		// short and Short
		// char and Character
		// int and Integer
		// String
		// Enum
		
	
		
		//     "apple"
		switch (item) {
		case "bread":
			price = 4.99;
			break;
		case "water":
			price = 2.99;
			break;
		case "apple":
			price = 1.5;
			break;
		case "red bull":
			price = 2.59;
			break;
		default:
			System.out.println("Invalid item name: " + item);
		}
		
		System.out.println("Item: " + item);
		System.out.println("Price: $" + price);
	}
}
