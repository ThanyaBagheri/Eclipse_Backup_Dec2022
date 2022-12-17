package test2;

public class HW024 {
    public static void main(String[] args) {
        String res = extraFront("Hello");
        System.out.println(res);
    }

    public static String extraFront(String str) {
      
      while (str.length()>2){
    	  return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    } 
    return str+str+str;
    }
}
