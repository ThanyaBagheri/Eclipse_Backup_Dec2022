package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 10, 39, 25, 4));
		System.out.println("sum: " + sumOfEven(list)); // sum: 
		
		list = new ArrayList<>(Arrays.asList(4, 4));
		System.out.println("sum: " + sumOfEven(list)); // sum: 
		
		
	}
	
	// [4, 2, 3, 10, 39, 25, 4] -> 87
	public static int sumOfEven(ArrayList<Integer> list) {
		// TODO
		int evenSum =0; 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)%2==0) 
			evenSum += list.get(i);
		}
		return evenSum;
	}


//	int evenSum = 0;
//	
//	for (Integer number : list) {
//		if (number % 2 == 0) {
//			evenSum += number;
//		}
//	}
//	
//	return evenSum;
}

