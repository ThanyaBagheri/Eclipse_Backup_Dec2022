package day38;

import java.util.HashMap;
import java.util.Map;

public class City {
	public static void main(String[] args) {
		// TODO
		// 1. Create a Map<String, Integer> that will hold these values
		// {Arlington=229164, Leesburg=375629, Manassas=451721, Richmond=210309}
		// 2. Print your map

		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		//cities.put("Manassas", 451721);
		//cities.put("Richmond", 210309);
		System.out.println(cities);

		// Set<String> keys = cities.keySet();
		for (String k : cities.keySet()) {
			Integer v = cities.get(k);
			System.out.println("city: " + k + ", population: " + v);
		}
		System.out.println("-------");

		int totalPop = 0;
		int averagePop = 0;

//		for (String keys : cities.keySet()) {
//			Integer value = cities.get(keys);
//			totalPop += value;
		
		for (Integer value: cities.values()) {
			totalPop += value;
		}
		averagePop = totalPop /cities.size();
		System.out.println("Total population: " + totalPop);
		System.out.println("Average population: " + averagePop);
	}
}
