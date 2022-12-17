package day14;

import java.util.Random;

public class EvenOddIncrease {
	public static final int BOUND = 1001;
	public static final int EVEN_INCREASE = 2;
	public static final int ODD_INCREASE = 3;
	
	public static void main(String[] args) {
		Random r = new Random();
		int value = r.nextInt(BOUND); // 0 - 1000
		System.out.println("original value: " + value);
		
		// TODO if value is even number increase by 2
		//      otherwise increase by 3
		//      change this to use ternary operator
		
		value = value % 2 == 0 ? value * EVEN_INCREASE : value * ODD_INCREASE;
		System.out.println("increased value: " + value);
	}
}
