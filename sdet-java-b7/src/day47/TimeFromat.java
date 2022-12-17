package day47;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFromat {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Time: "+now);//Time: 20:03:35.602883
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
		String timeStr = f.format(now);
		System.out.println(timeStr);//20:03
		
		f = DateTimeFormatter.ofPattern("hh:mm a");
		timeStr = f.format(now);
		System.out.println(timeStr);//08:03 PM
		
		LocalTime breakTill = now.plusMinutes(10);
		timeStr = f.format(breakTill);
		System.out.println("BREAK TILL: " +timeStr);//BREAK TILL: 08:13 PM
	}
}
