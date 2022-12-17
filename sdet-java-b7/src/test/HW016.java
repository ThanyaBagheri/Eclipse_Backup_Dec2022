package test;

public class HW016 {

    public static void main(String args[]){
        String alarmTime = alarmClock(0, true);
        System.out.println(alarmTime);
    }

    public static String alarmClock(int day, boolean vacation) {
     	
    	if (day>=1 && day<=5 && !vacation){
          return "7:00";
     	} else if ((day==0 || day==6) && !vacation){
              return "10:00";
        
     	} else if (day>=1 && day<=5 && vacation){
            return "10:00";
     	} else if ((day==0 || day==6) && vacation){
          return "off";
       
        }else{
          return "off";
        }
	} 
}



