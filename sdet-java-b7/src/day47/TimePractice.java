package day47;

import java.time.LocalTime;

public class TimePractice {
	public static void main(String[] args) {
		//LocalTime
		LocalTime now = LocalTime.now();
		System.out.println(now);//19:49:53.742537
		
		int hr = now.getHour();
		System.out.println("hour: "+ hr);
		
		int mins = now.getMinute();
		System.out.println("minutes: "+ mins);
		
		int secs = now.getSecond();
		System.out.println("seconds "+secs);
		
		int nanoSeconds = now.getNano();
		System.out.println("nano seconds: "+nanoSeconds);
		System.out.println("-----");
		
		LocalTime time = LocalTime.of(7, 5, 10);
		System.out.println(time);
		
		LocalTime afterSomeTime = now.plusSeconds(nanoSeconds);
		System.out.println(afterSomeTime);
	
		
	}
}
