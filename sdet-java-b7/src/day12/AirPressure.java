package day12;

import util.InputFromUser;

public class AirPressure {
	//public static final double NORMAL_PRESSURE_START = 13.5;
	//public static final double NORMAL_PRESSURE_END = 15.5;
	Double NORMAL_PRESSURE_START = 13.5;
	Double NORMAL_PRESSURE_END = 15.5;
	
	public static void main(String[] args) {
		Double NORMAL_PRESSURE_START = 13.5;
		Double NORMAL_PRESSURE_END = 15.5;
		// if pressure is from 13.5 to 15.5 inclusive - "normal pressure"
		// if pressure is less than 13.5 - "low pressure"
		// if pressure is greater than 15.5 - "high pressure"
		double pressure = Double.parseDouble(InputFromUser.getInput("Enter pressure:"));
		
		if (pressure >= NORMAL_PRESSURE_START && pressure <= NORMAL_PRESSURE_END) {
			System.out.println("normal pressure");
			
		} else if (pressure < NORMAL_PRESSURE_START) {
			System.out.println("low pressure");
			
		} else if (pressure > NORMAL_PRESSURE_END) {
			System.out.println("high pressure");
			
		} else {
			System.out.println("Undefined pressure");
		}
	}
}