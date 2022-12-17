package test3;

public class HW032 {
    public static void main(String[] args) {
        boolean res = bobThere("abcxyz");
        System.out.println(res);
    }

    public static boolean bobThere(String str) {

      for (int i=0; i<str.length()-2;i++){
        if (str.length()>=3&&str.charAt(i)=='b'&&str.charAt(i+2)=='b'){
          return true;
        }
      }
      return false;
    }
}
