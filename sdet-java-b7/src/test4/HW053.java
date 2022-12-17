package test4;

import java.util.Arrays;

public class HW053 {
	public static void main(String[] args) {
    	int[] arrNum = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrNum)); // [1, 2, 3, 4, 5]
      
        revArr(arrNum);
      
        System.out.println(Arrays.toString(arrNum)); // [5, 4, 3, 2, 1]

    }
  
    public static void revArr(int[] arrNum) {
    	// your code goes here
      int count = arrNum.length-1;
      int[] newArr = new int[arrNum.length];
      for (int i = 0; i < newArr.length; i++){
        newArr[i]= arrNum[count];
        count--;
      }
      arrNum = newArr;
	System.out.println(Arrays.toString(arrNum));
    }
}
