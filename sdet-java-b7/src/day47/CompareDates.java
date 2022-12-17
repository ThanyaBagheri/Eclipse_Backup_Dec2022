package day47;

import java.time.LocalDate;
import java.time.Month;

public class CompareDates {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);//2022-12-01
		
		LocalDate someDay = LocalDate.of(2022, Month.NOVEMBER, 25);
		System.out.println(someDay);//2022-11-25
		
		//today is after someDay? //true
		System.out.println(today.isAfter(someDay));
		
		//today is before someDay? //false
		System.out.println(today.isBefore(someDay));
		
		//today is equals someDay? //false
		System.out.println(today.equals(someDay));
		
		//local dates and times are immutable object 
		someDay = someDay.plusDays(50);
		System.out.println(someDay);//2023-01-14
		
		someDay = someDay.plusWeeks(2);
		System.out.println(someDay);//2023-01-28
		
		someDay = someDay.minusWeeks(3);
		System.out.println(someDay);//2023-01-07
		
	}
}
