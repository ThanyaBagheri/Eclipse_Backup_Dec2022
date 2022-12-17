package test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class HWproject2 {
	public static void main(String[] args) {
		String name = InputFromUser.getInput("Enter your name:");
		int pounds = Integer.parseInt(InputFromUser.getInput("Enter your weight in pounds:"));
		int feet = Integer.parseInt(InputFromUser.getInput("Enter your height in feet:"));
		int inches = Integer.parseInt(InputFromUser.getInput("and inches:"));

		//int pounds = 255;
		//int feet = 6;
		//int inches = 1;
				
		
		double mass = getMassInKilograms(pounds);
		double heightMeters = getHeightInMeters(feet, inches);
		double bmi = calculateBMI(mass, heightMeters);
		String healthRisk = getHealthRiskBasedOnBMI(bmi);

		
		
		
		//System.out.println("Name: " + name);
		System.out.println("BMI: " + bmi);
		System.out.println("Health risk: " + healthRisk);
	}

	public static double getMassInKilograms(int pounds) {
		// TODO write your code here to convert pounds to kilograms and return it
		double kg = pounds / 2.2;
		return kg;
	}

	public static double getHeightInMeters(int feet, int inches) {
		// TODO write your code here to convert feet and inches to meters and return it
		double meters = (inches + (feet * 12)) * 0.0254;
		return meters;
	}

	public static double calculateBMI(double massInKilo, double heightInMeters) {
		// TODO write your code here to calculate and return BMI
		double bmi = massInKilo/(heightInMeters*heightInMeters);
		return bmi;
	}

	public static String getHealthRiskBasedOnBMI(double bmi) {
		// TODO write your code here to get valid health risk message based on
		// requirement
		if (bmi >= 30) {
			return "Obese";
		}
		if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		}
		if (bmi >= 18.5 && bmi < 25) {
			return "normal";

		} else {
			return "underweight";
		}
	}

}

// do not change this code, program needs this code for testing purposes only
class InputFromUser {
	public static boolean isRunFromTest = false;
	public static List<String> input;
	public static int index = 0;

	public static String getInput(String msg) {
		if (isRunFromTest) {
			return input.get(index++);
		} else {
			try {
				BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println(msg);
				return buffReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}

	}

	public static String getInput() {
		if (isRunFromTest) {
			return input.get(index++);
		} else {
			try {
				BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
				return buffReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
}
