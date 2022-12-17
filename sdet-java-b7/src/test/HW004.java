package test;

public class HW004 {
	public static void main(String[] args) {
		double fahrenheit = convertCelsiusToFahrenheit(41);
		System.out.println("Fahrenheit: " + fahrenheit);
	}

	public static double convertCelsiusToFahrenheit(int celsius) {
		double fahrenheit = 1.8*celsius+ 32;
		return fahrenheit;
	}
}
