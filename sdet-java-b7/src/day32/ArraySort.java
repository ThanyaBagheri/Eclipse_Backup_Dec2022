package day32;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		// in production, we need to use built-in sorting algorithms from Java
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		
		// Arrays is a helper class for an array in java
		// it has many useful methods
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}
}
