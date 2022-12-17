package day19;

public class DayOfWeek {
	

	public static void main(String[] args) {
		printDayMsg(Day.Mon);
		printDayMsg(Day.Tue);
		
		//1. Declare(Create) enum
		//2. put enum values
		//3.change arg for method to use enum
		//4.write logic
		//5.change and write client code
		
	}
	
	/*
	 * Based on the day print the following:
	 * Mon - HW day
	 * Tue - study day
	 * Wed - relaxing day
	 * Thur - study day
	 * Fri - coding day
	 * Sat - java epic day
	 * Sun - kahoot day
	*/
	
	public static void printDayMsg(Day day) {
		
		if (day.equals(Day.Mon)) {
			System.out.println("Homework day!");
		}else if (day.equals(Day.Tue)||day.equals(Day.Thur)) {
			System.out.println("Study day!");
		}else if (day.equals(Day.Wed)) {
			System.out.println("Relaxing day!");
		}else if (day.equals(Day.Fri)) {
			System.out.println("Coding day!");
		}else if (day.equals(Day.Sat)) {
			System.out.println("java epic day");
		}else if (day.equals(Day.Sun)) {
			System.out.println("Kahoot day!");
		}else {
			System.out.println("Undefined day");
		}
		
	}
}

