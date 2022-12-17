package test4;
	import java.util.ArrayList;
	import java.util.List;

	public class HW050 {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(3);
	        list.add(1);
	        list.add(4);

	        List<Integer> res = square56(list);
	        System.out.println(res);
	    }

	    public static List<Integer> square56(List<Integer> nums) {
			// your code goes here
	    	List<Integer> res = new ArrayList<>();
		      
		      for (int num : nums){
		        num = (num*num)+10;
		        if (num%10!=6&&num%10!=5){
		        res.add(num);
		      }
		    }
		  	return res;
		    }
		}
