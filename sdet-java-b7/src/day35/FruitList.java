package day35;

import java.util.ArrayList;

public class FruitList {
	public static void main(String[] args) {
		// TODO
		// Create ArraList of String
		// Add 5 elements (fruit names)
		// Print each element in the new line from the back of the list by using the
		// loop

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("orange");
		fruits.add("mango");
		System.out.println(fruits); // [apple, banana, kiwi, orange, mango]

//		for (int i = fruits.size() - 1; i >= 0; i--) {
//			System.out.println(fruits.get(i));
//		}
//		System.out.println("---");
		// [apple, banana, kiwi, orange, mango]
		// [APPLE, BANANA, KIWI, ORANGE, MANGO]
		// I want to change my list elements to be all of them in upper case

		// TODO complete this task to convert each element to upper case
		// set(index, newValue)
//		String upperElement = fruits.get(1).toUpperCase();
//		fruits.set(1, upperElement);

		for (int i = fruits.size() - 1; i >= 0; i--) {
			String newFruits = fruits.get(i);
			for (int j = 0; j <newFruits.length(); j++) {
				newFruits=newFruits.toUpperCase();
		}
		System.out.println(newFruits); // [APPLE, BANANA, KIWI, ORANGE, MANGO]
	}
}
}