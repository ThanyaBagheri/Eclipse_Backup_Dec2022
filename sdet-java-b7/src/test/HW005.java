package test;

public class HW005 {
    public static void main (String[] args) {
        int a = 5;
        int b = 1;

        System.out.println(min(a, b));
    }

    public static int min(int a, int b){
        if(a < b) {
        	return a;
        } else {
        	return b;
        }
    }
}
