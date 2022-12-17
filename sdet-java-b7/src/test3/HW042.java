package test3;

public class HW042 {
    public static void main(String[] args) {
        int[] a = new int[] {10, 3, 5, 6};
        int res = bigDiff(a);

        System.out.println(res);
    }

    public static int bigDiff(int[] nums) {
        // your code goes here
      int min =nums[0];
      int max =nums[0];
      int sum =0;
      for (int i=0; i<nums.length; i++){
        min = Math.min(min,nums[i]);
        max = Math.max(max,nums[i]);
        sum = min+max;
      
      }
  		return sum;
}
    }


