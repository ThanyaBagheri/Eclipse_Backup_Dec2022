package test2;

public class HW017 {
    public static void main(String args[]) {
        
    	boolean res = lessBy10(3, 3, 30);
        System.out.println(res);
    }

    public static boolean lessBy10(int a, int b, int c) {
        //if(a-b==10 || a-c==10 || b-c==10){
          //return true;
    	int r = Math.abs(a-b);
    	int r1 = Math.abs(b-c);
    	int r2 = Math.abs(a-c);
    	
    	if(r==10 || r1==10 || r2==10){
            return true;
    	}else {
    		return false;
    	}
    	}
        }
    



