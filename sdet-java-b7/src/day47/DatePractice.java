package day47;

import java.time.LocalDate;

public class DatePractice {
	public static void main(String[] args) {
		//Current date
		//new keyword is hidded under now.
		LocalDate today = LocalDate.now();
		//take date from the computer system
		System.out.println(today);//2022-12-01
		//they are constants value(Enum) that why they are in capital letters 
		System.out.println(today.getDayOfWeek()); //THURSDAY
		System.out.println(today.getMonth());//DECEMBER
		System.out.println(today.getYear()); //2022
		System.out.println(today.getDayOfMonth());//1
		System.out.println(today.isLeapYear());//false
		
		LocalDate birthday = LocalDate.of(1996, 01, 10);
		System.out.println(birthday);
		System.out.println(birthday.getDayOfWeek());//WEDNESDAY
		System.out.println(birthday.isLeapYear());//true
		System.out.println("------");
		
		LocalDate someHappyDay = LocalDate.of(2025, 05, 15);
		System.out.println(someHappyDay.getDayOfWeek());//THURSDAY
		System.out.println(someHappyDay.isLeapYear());//false
		
	}
}
