package day33;

import java.util.Arrays;

public class MArrayPractice {
	public static void main(String[] args) {
		// TODO
		
		int[][] num = {
				{1532, 1113, 1124, 1134, 1145}, 
				{1158, 1191, 1208, 1225, 1242}, 
				{1216, 1174, 1191, 1208, 1225},
				{1276, 1262, 1286, 1311, 1335},
				{1340, 1338, 1370, 1403, 1436}
				};
		
		System.out.println(Arrays.deepToString(num));
		
		for (int[] inner : num) {
			for (int element : inner) {
				System.out.println(element);
			}
		}
		System.out.println("------");
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				int element = num[i][j];
				System.out.println(element);
			}
		}
	}
}