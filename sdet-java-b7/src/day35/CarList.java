package day35;

import java.util.ArrayList;

public class CarList {
	public static void main(String[] args) {
		// TODO create ArrayList of String 
		// with these elements ["bmw", "audi", "honda", "tesla"]
		// print each element in the new line
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		cars.add("tesla");
		System.out.println(cars); // [bmw, audi, honda, tesla]
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("---");
		
		// it is possible to use for each loop with ArrayList as well
		for (String car : cars) {
			System.out.println(car);
		}
		
	}
}
