package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		// removing duplicates
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 1))));
		// [1, 2, 3]
		
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(1, 1)))); 
		// [1]
		
		System.out.println(removeDup(new ArrayList<>(Arrays.asList(5, 4, 6))));
		// [5, 4, 6]
		
		System.out.println("---");
		
		System.out.println(removeDupStr("aaabbccaa")); // abc
		System.out.println(removeDupStr("hello")); // helo
		System.out.println(removeDupStr("java")); // java
	}
	
	/*
	 * remove duplicates from list
	 * removeDup([1, 1, 1, 2, 2, 3, 1]) -> [1, 2, 3]
	 * removeDup([1, 1])                -> [1]
	 * removeDup([5, 4, 6])             -> [5, 4, 6]
	 */
	public static List<Integer> removeDup(List<Integer> list) {
		// TODO load to set and convert back to ask data type
		Set<Integer> set = new HashSet<>(list);
		
		List<Integer> nums = new ArrayList<>(set);
		
		return nums;
	}
	
	/*
	 * remove duplicates from str
	 * removeDupStr("aaabbccaa") -> "abc"
	 * removeDupStr("hello")     -> "helo"
	 * removeDupStr("java")      -> "java"
	 */
	public static String removeDupStr(String str) {
		// TODO load to set and convert back to ask data type

		Set<Character> set = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		String res ="";
		for (char ch : set ) {
		res += ch;	
		}
		return res;
	
//	StringBuilder sb = new StringBuilder();
//	for (char ch : set) {
//		sb.append(ch);
//	}
//	return sb.toString();
	}
}


