package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormaterPractice {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);//2022-12-01
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYY");
		String todayStr = f.format(today);
		System.out.println(todayStr);//12/01/2022
		
		f = DateTimeFormatter.ofPattern("MMMM dd,YY");
		todayStr = f.format(today);
		System.out.println(todayStr);//December 01,22
		
		f = DateTimeFormatter.ofPattern("dd.MM.YY");
		todayStr = f.format(today);
		System.out.println(todayStr);//01.12.22
	}
}
