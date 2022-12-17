package test4;

public class HW045 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 2, 1};
        int res = sum13(a); // 6

        System.out.println(res);
    }

    public static int sum13(int[] nums) {
       // your code goes here
      int sum = 0;
      for (int i=0; i<nums.length; i++){
        if (nums[i]==13)
          continue;
        if (i>0 && nums[i-1]==13)
          continue;
        
          sum += nums[i];
      }
      return sum;
    }
}