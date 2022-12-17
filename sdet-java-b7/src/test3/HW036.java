package test3;

public class HW036 {
	   public static void main(String[] args) {
	        String res = repeatEnd("Hello", 3);
	        System.out.println(res);
	    }

	    public static String repeatEnd(String str, int n) {
	        // your code goes here
	    	String res="";
	    	int len = str.length();
	    	
	      for (int count = 0 ; count<n;count++){
	           
	       res= res + str.substring(len-n,len);
	          
	    }

	    return res;
	    }
	}
	
	
