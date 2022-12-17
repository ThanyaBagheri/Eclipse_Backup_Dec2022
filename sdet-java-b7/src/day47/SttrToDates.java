package day47;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class SttrToDates {
	public static void main(String[] args) {
		//                           YYYY-MM-dd
		String winterOlympicsDate = "2002-02-08";

		LocalDate wOlympicsDate = LocalDate.parse(winterOlympicsDate);		
		System.out.println(wOlympicsDate);
		System.out.println(wOlympicsDate.getDayOfWeek());
		
		String summerOlympicsDate = "06/19/1996";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		
		LocalDate sOlympicsDate = LocalDate.parse(summerOlympicsDate, f);
		System.out.println(sOlympicsDate);
		System.out.println(sOlympicsDate.getDayOfWeek());
		
		boolean isAfter = wOlympicsDate.isAfter(sOlympicsDate);
		System.out.println("Winter Olympics was after Summer Olympics: " + isAfter);
	}
}
