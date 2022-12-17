package test3;

public class HW035 {
    public static void main(String[] args) {
        String res = mixString("abc", "xyz");
        System.out.println(res);
    }

    public static String mixString(String a, String b) {
       // your code goes here
      int lenA = a.length();
      int lenB = b.length();
      String res = "";
      
      for (int i=0; i < Math.max(lenA,lenB); i++){
        if (i<lenA)
          res = res + a.substring(i,i+1);
        if (i<lenB)
          res = res + b.substring(i,i+1);
    	}
  		return res;
    }
}
