package test3;
import java.util.Arrays;

public class HW041 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        int[] res = rotateLeft3(a);

        System.out.println(Arrays.toString(res));
    }

    public static int[] rotateLeft3(int[] nums) {
        // your code goes here
      int[] number = {nums[1],nums[2],nums[0]};
    
    return number;
}
}
