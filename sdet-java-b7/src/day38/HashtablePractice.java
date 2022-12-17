package day38;

import java.util.Hashtable;
import java.util.Map;

public class HashtablePractice {
	public static void main(String[] args) {
		// Hashtable is older version of HashMap
		// Hashtable vs HashMap?
		// - Hashtable doesn't allow any null keys or values
		//   HashMap allows one null key and multiple null values
		// - Hashtable is syncronyzed and HashMap is not.
		
		Map<Integer, String> numbers = new Hashtable<>();
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		
		System.out.println(numbers); // {3=three, 2=two, 1=one}
		 numbers.put(null, "four"); //cannot add null key to Hashtable
		// numbers.put(4, null); cannot add null value to Hashtable
	}
}
