package day39;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		int[] arrNums = {4, 3, 2, 1, 8};
		int[] arrNumsTwo = {1, 8, 8, 9};
		
		// [4, 3, 2, 1, 8, 1, 8, 8, 9] 
		// Sum: 
		
		// TODO
		// Create one more array that will have values 
		// from first array(arrNums) and seconds array(arrNumsTwo)
		// and print that new array by using Arrays.toString();
		
		// TODO
		// Find out total sum of all values
		
		
		//1.Create new Array
		int[] newArr = new int[(arrNums.length)+(arrNumsTwo.length)];
	
		//2. Assign values to new array 
		for (int i = 0; i < arrNums.length; i++) {
			newArr[i] = arrNums[i];
		}
	
		for (int j = 0; j < arrNumsTwo.length; j++) {
			newArr[arrNums.length+j] = arrNumsTwo[j];
		}
		//3. print new Array
		System.out.println(Arrays.toString(newArr));
		
		//4. get sum of new array
		int sum =0;
		for (int num: newArr) {
			sum += num;
		}
		System.out.println(sum);
	}
}
