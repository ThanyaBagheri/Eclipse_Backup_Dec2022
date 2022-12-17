package test4;

	import java.util.ArrayList;
	import java.util.List;

public class HW048 {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);

	        List<Integer> res = two2(list);
	        System.out.println(res);
	    }

	    public static List<Integer> two2(List<Integer> nums) {
			// your code goes here
	      for (int i = nums.size()-1; i>=0; i--){

	        if ((nums.get(i)*2)%10==2){
	          nums.remove(nums.get(i));
	      }else{
	        nums.set(i,nums.get(i)*2);
	      }
	      }
	      return nums;
	    }
	}

