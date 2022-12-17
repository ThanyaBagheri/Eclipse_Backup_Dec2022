package day46;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new BMW();
		// Car car    => reference type
		// new BMW(); => actual object
		
		// reference type decides what's available
		car.drive();
		car.stop();
		// car.driveFast(); // doesn't compile
		
		// People refer to method override as runtime 
		// polymorphism. 
		// In polymorphic objects when child class overrides
		// the method of parent class, java doesn't know that
		// java thinks code will call parent class method
		// but during the runtime, it will call child class method
		
		Car car2 = new Audi();
		// car2.ecoDriver();
		
		// type casting
		Audi audi = (Audi)car2;
		audi.ecoDrive();
		
		// we cannot not related objects
		// BMW bmw = (BMW) audi;
		
		// Car carThree = new BMW();
		// Audi audiTwo = (Audi)carThree; // java.lang.ClassCastException
		// audiTwo.ecoDrive();
	}
}
