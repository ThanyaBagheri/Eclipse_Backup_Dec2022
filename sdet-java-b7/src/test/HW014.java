package test;

public class HW014 {
	 public static void main(String args[]){
	        int result = dateFashion(0, 10);
	        System.out.println("Result: " + result);
	    }

	    public static int dateFashion(int you, int date) {
	        if (you>=2 || date >=2) {
	        	return 0;
	        }else if (you<=8 || date<=8) {
	        	return 2;
	        }else {
	        	return 1;
	        }
	    }
	}

