package day35;

import java.util.ArrayList;

public class NumberList {
	public static void main(String[] args) {
		// ArrayList is dynamic sized collection of data
		// - it can work only with objects
		
		ArrayList<Integer> numbers = new ArrayList<>(); 
		System.out.println(numbers); // []
		
		// add(element) adds new element to the list
		numbers.add(4);
		numbers.add(3);
		numbers.add(77);
		numbers.add(99);
		System.out.println(numbers); // [4, 3, 77, 99]
		
		// get(index) reads element from the list based on the index
		System.out.println(numbers.get(0)); // 4
		
		// set(index, newValue) changes value of existing element
		numbers.set(0, 9);
		System.out.println(numbers);
		
		// size() returns the number of elements inside the list
		int size = numbers.size();
		System.out.println("Size: " + size);
		
		for (int i = 0; i < size; i++) {
			int element = numbers.get(i);
			System.out.println(element);
		}
		System.out.println("---");
		
		// TODO I want to create ArrayList of character with values ['a', 'b', 'c', 'd']
		ArrayList<Character> chars = new ArrayList<>();
		// <Character> - what data type we are going to put in the list
		chars.add('a');
		chars.add('b');
		chars.add('c');
		chars.add('d');
		System.out.println(chars);
		
		int indexOfLastElement = chars.size() - 1;
		char ch = chars.get(indexOfLastElement);
		System.out.println(ch); // d
		
		chars.set(1, 'w');
		System.out.println(chars);
		
		// add(value) adds new element to the list
		// get(index) gets element from the list based on the index
		// set(index, newValue) sets new value for existing element
		// size() returns number of elements
	}
}
