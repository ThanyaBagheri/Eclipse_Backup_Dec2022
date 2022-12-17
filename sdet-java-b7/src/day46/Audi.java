package day46;

public class Audi extends Car {
	@Override
	public void drive() {
		System.out.println("Audi is driving");
	}
	
	public void ecoDrive() {
		System.out.println("Audi is driving in eco mode");
	}
}
