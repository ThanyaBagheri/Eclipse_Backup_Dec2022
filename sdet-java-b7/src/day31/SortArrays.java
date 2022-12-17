package day31;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int[] num = { 6, 3, 2, 100, 0, 1, 5, 88, 90 };
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

		String[] names = { "Bek", "John", "Kuba", "Alex", "Azamat", "Artem" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
}
