package day37;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		// HashSet
		//Set doesn't allow duplicates
		//HashSet doesn't maintain insertion order
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		numbers.add(0);
		numbers.add(-8);
		
		System.out.println(numbers); //[0, 1, 2, 3, 4]
		
		// there is no index for specific element
		// we cannot get single element from set
		// int firstElemrnt = numbers.get(0);
		System.out.println("----");
		
		Set<String> names = new HashSet<>();
		names.add("Kaba");
		names.add("John");
		names.add("Alex");
		names.add("Kaba");
		System.out.println(names);//[Alex, Kaba, John]
		
		//loop over the set by using for each loop
		for (String name: names) {
			System.out.println(name);
		}
	}
}
