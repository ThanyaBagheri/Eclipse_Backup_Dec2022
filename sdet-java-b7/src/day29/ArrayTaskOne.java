package day29;

import java.util.Arrays;

public class ArrayTaskOne {
	public static void main(String[] args) {
		int[] number = new int[3];
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;

		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);

		
		String[] team = new String[4];
		team[0] = "one";
		team[1] = "two";
		team[2] = "three";
		team[3] = "four";

		System.out.println(Arrays.toString(team));
	}
}
