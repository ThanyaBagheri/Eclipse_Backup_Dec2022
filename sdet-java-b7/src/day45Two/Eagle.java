package day45Two;

//We can implement multiple interfaces at the same time
public class Eagle implements AnimalInterface, CanFly {
	@Override
	public void eat() {
		System.out.println("Eagle is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Eagle is sleeping");
	}

	@Override
	public void drink() {
		System.out.println("Eagle is drinking");
	}
	
	@Override
	public void fly() {
		System.out.println("Eagle is flying");
	}
}
