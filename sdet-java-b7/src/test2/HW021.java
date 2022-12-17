package test2;

public class HW021 {
    public static void main(String[] args) {
 String str = "Hello Everyone";
 int len = str.length();
 
 System.out.println(str.substring(len-1));
 System.out.println(str.substring(len-1,len));
 System.out.println(str.substring(len));
 System.out.println(str.substring(1,len-1));
    }
}

