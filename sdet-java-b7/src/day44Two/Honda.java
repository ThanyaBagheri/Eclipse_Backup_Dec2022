package day44Two;

public class Honda extends Car {

	@Override
	public void drive() {
		 System.out.println("Honda is driving");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("Honda is turning left");
		
	}

	@Override
	public void turnRight() {
		System.out.println("Honda is turning right");
		
	}

	@Override
	public void stop() {
		System.out.println("Honda is stopped");
		
	}	
}
