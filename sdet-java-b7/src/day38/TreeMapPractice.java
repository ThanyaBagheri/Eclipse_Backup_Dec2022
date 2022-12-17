package day38;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		// sorted by key Map implementation
		Map<Integer, Double> items = new TreeMap<>();
		items.put(5, 0.1);
		items.put(3, 0.2);
		items.put(0, 0.5);
		items.put(8, 0.4);
		items.put(12, 0.5);
		items.put(0, 0.6);
		
		System.out.println(items); // {0=0.6, 1=0.3, 3=0.2, 5=0.1, 8=0.4, 12=0.5}
	}
}
