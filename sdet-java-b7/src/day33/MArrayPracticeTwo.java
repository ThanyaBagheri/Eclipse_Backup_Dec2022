package day33;

import java.util.Arrays;

public class MArrayPracticeTwo {
	public static void main(String[] args) {
		int[][] numbers = { { 1532, 1113, 1124, 1134, 1145 }, { 1158, 1191, 1208, 1225, 1242 },
				{ 1216, 1174, 1191, 1208, 1225 }, { 1276, 1262, 1286, 1311, 1335 }, { 1340, 1338, 1370, 1403, 1436 } };

		int totalSum = 0;
		int averageValue = 0;
		int numelement=0;

		// TODO

		for (int i = 0; i < numbers.length; i++) {
			int[] inner = numbers[i];
			System.out.println(Arrays.toString(inner));
			for (int j = 0; j < numbers[i].length; j++) {
				totalSum+= inner[j];
				numelement ++;
				
				averageValue = totalSum/numelement;
				
			}	
		}
		System.out.println("The total sum is " + totalSum);
		System.out.println("The average value is " + averageValue);

		int numberOfElements = 0;
		int sum=0;
		int average =0;
		
		for (int[] innerArray : numbers) {
			numberOfElements += innerArray.length;
			for (int num : innerArray) {
				sum += num;
				// numberOfElements++;
				
				average =  sum/numberOfElements;
			}
		}
				System.out.println("The total sum is " + sum);
				System.out.println("The average value is " + average);
			}
		}


