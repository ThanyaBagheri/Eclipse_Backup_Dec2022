package day46;

public class BMW extends Car {
	public boolean isSportCar;
	
	@Override
	public void drive() {
		System.out.println("BMW is driving");
	}
	
	public void driveFast() {
		System.out.println("BMW is driving fast");
	}
}
