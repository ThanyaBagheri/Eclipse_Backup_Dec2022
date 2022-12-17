package day43;

public class CarDemo {
	public static void main(String[] args) {
		Car carOne = new Car("BMW", "white", 2020, 30000.0);
		Car carTwo = new Car("BMW", "white", 2020, 30000.0);
		
		System.out.println(carOne);
		System.out.println(carTwo);
		
		if (carOne.equals(carTwo)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}