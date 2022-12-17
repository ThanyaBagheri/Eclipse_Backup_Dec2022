package day33;

public class MPractice {
	public static void main(String[] args) {
		int[][] numbers = {
				{1532, 1113, 1124, 1134, 1145},
				{1158, 1191, 1208, 1225, 1242},
				{1216, 1174, 1191, 1208, 1225},
				{1276, 1262, 1286, 1311, 1335},
				{1340, 1338, 1370, 1403, 1436}
		};
		
		int totalSum = 0;
		int averageValue = 0;
		int numberOfElements = 0;
		
		for (int[] innerArray : numbers) {
			numberOfElements += innerArray.length;
			for (int num : innerArray) {
				totalSum += num;
				// numberOfElements++;
			}
		}
		
		averageValue = totalSum / numberOfElements;
		System.out.println("The total sum is " + totalSum);
		System.out.println("The average value is " + averageValue);
	}
}
