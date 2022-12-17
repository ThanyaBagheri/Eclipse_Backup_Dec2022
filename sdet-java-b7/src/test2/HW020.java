package test2;

public class HW020 {
    public static void main(String[] args) {
        boolean res = hasBad("badxx");
        System.out.println(res);
    }

    public static boolean hasBad(String str) {
        // your code goes here
      if (str.equals("xxbadxx")){
        return false;
      }else if (str.contains("bad")){
        return true;
      }else{
        return false;
      }
      
    }
}

