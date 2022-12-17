package day32;

public class ArrayPractice {
	public static void main(String[] args) {
		System.out.println(getTotalSum(new int[] { 5, 4, 3, 2 })); // 14
		System.out.println(getTotalSum(new int[] { 1, 1, 3, 2 })); // 7
		System.out.println(getTotalSum(new int[] { 1, 1, 1, 1 })); // 4
		
		System.out.println("---");
		
		System.out.println(getTotalOddSum(new int[] {5, 4, 3, 2})); // 8
		System.out.println(getTotalOddSum(new int[] {1, 1, 3, 2})); // 5
		System.out.println(getTotalOddSum(new int[] {1, 1, 1, 1})); // 4
		System.out.println("---");
		
		System.out.println(getMaxMinSum(new int[] {5, 4, 3, 2})); //7
		System.out.println(getMaxMinSum(new int[] {1, 1, 3, 2})); //4
		System.out.println(getMaxMinSum(new int[] {1, 1, 1, 1})); //
		System.out.println(getMaxMinSum(new int[] {10, 15, 8, 9}));
	}
	
	/*
	 * getMaxMinSum([5, 4, 3, 2])   -> 7
	 * getMaxMinSum([1, 1, 3, 2])   -> 4
	 * getMaxMinSum([1, 1, 1, 1])   -> 2
	 * getMaxMinSum([10, 15, 8, 9]) -> 23
	 * 
	 * Complete this without built-in sorting from Arrays
	 */
	public static int getMaxMinSum(int[] arr) {
		// TODO
	int min = arr[0];
    int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		return min + max;
			
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);			
		}		
		return max + min;
	}

	
	/*
	 * getTotalOddSum([5, 4, 3, 2]) -> 8
	 * getTotalOddSum([1, 1, 3, 2]) -> 5
	 * getTotalOddSum([1, 1, 1, 1]) -> 4
	 */
	public static int getTotalOddSum(int[] arr) {
		int sum = 0;

		for (int i : arr) {
			if (i %2 == 1) {
				//if (i %2 != 0) {
			sum += i;
			}
		}
		return sum;	
	}

	/*
	 * getTotalSum([5, 4, 3, 2]) -> 14 getTotalSum([1, 1, 3, 2]) -> 7
	 * getTotalSum([1, 1, 1, 1]) -> 4
	 */
	public static int getTotalSum(int[] arr) {
		int sum = 0;

		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
}

