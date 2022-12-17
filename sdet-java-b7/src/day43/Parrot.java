package day43;

public class Parrot extends Bird {

	public void talk() {
		System.out.println("jib jib");
	}
	
//	// everything should be similar to original method
//	@Override
//	public void fly() {
//		System.out.println("Parrot " + name + " is flying");
//	}
	
	@Override
	public void fly() {
		// super refers to the parent object
		// call parent class Bird fly method
		super.fly();
		
		System.out.println("Parrot " + name + " is flying"); 
	}

	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.name = "Jack";
		parrot.fly();
		parrot.talk();
	}
}
