package day33;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		// [[0,0,0]],[[0,0,0]]
		
		int[][] numArr = new int[2][3];
		
		//     0         1
		// [[4,0,0]],[[0,0,0]]
		//   0 1 2     0 1 2
		
		numArr[0][0] = 4;
	    numArr[1][2] = 3;
	    numArr[0][2] = 5;
		
	    System.out.println(numArr[0][0]);
	    System.out.println(Arrays.toString(numArr));
	    System.out.println(Arrays.deepToString(numArr));
	    
	    int[][] numArrTwo = {{1,4,7},{2,5},{0,9,9,8,7,4,10}};
	   
		System.out.println(Arrays.deepToString(numArrTwo));
		
		// [[1, 4, 7], [2, 5], [0, 9, 9, 8, 7, 4, 10]]
		System.out.println(numArrTwo[2][0]); // 0
		System.out.println(numArrTwo[0][2]); // 7
	}
}
