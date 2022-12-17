package day48;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Today {
	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		// LocalDateTime
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd, YYYY hh:mm a");
		System.out.println(today);
		
		String todayStr = f.format(today);
		System.out.println(todayStr);
		System.out.println("---");
		
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate); // 2022-12-03
		
		LocalTime todayTime = LocalTime.now();
		System.out.println(todayTime); // 09:23:19.474019
		System.out.println("---");
		
		String str = "2022-11-01";
		// If format of String is default (uuuu-MM-dd) then we can just use 
		// parse method to convert to LocalDate object
		LocalDate dateOne = LocalDate.parse(str);
		System.out.println(dateOne); // 2022-11-01
		
		String strTwo = "2022/11/01";
		DateTimeFormatter fTwo = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		LocalDate dateTwo = LocalDate.parse(strTwo, fTwo);
		System.out.println(dateTwo); // 2022-11-01
	}
}
