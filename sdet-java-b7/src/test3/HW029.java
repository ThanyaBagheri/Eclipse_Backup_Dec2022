package test3;

public class HW029 {
    public static void main(String[] args) {
        int res = countCode("xxcozeyycop");
        System.out.println(res);
    }

    public static int countCode(String str) {
      int count =0;
      
      for (int i=0; i<str.length()-3; i++){
      if (str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e')
      count++;
      }
      return count;
    }
}

