package test3;
import java.util.Arrays;
public class HW043 {
    public static void main(String[] args) {
        int[] a = new int[] {5, 3, 4, 6, 2}; //3+4+5=12/2
        int res = centeredAverage(a); // 5

        System.out.println(res);
    }

    public static int centeredAverage(int[] nums) {
        
      int sum =0;
      int center=0;
      Arrays.sort(nums);
      
      for (int i=1; i<nums.length-1; i++){
        sum += nums[i];
        center = sum/2;
      }
      return center;
    }
}
