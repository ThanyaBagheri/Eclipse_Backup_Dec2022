package test;

public class hw_15_2 {


    public static void main(String args[]){
        boolean isPlay = squirrelPlay(95, true);
        System.out.println(isPlay);
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer = true && temp >=60 && temp <=100){
          return true;
        }
          else if (isSummer = false && temp <= 60 && temp >=90){
            return true;
          
        }else if (isSummer = false && temp >= 90){
          return false;
         
        }
         else {
         return false;
    }
    }
}
