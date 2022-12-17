package test4;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        System.out.println(whenIWasKiddo());
    }

    public static String whenIWasKiddo() {
        // your code goes here
    	LocalDate d = LocalDate.now();
    	//System.out.println(d);
        d = d.minusYears(20);
        d = d.minusMonths(7);
     
        // return current date minus 20 years and 7 months as String in yyyy-mm-dd format
        return d.toString();
    }
}
