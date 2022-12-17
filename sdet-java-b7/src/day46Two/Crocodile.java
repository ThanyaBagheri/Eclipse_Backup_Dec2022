package day46Two;

public class Crocodile implements Reptile {
	@Override
	public String getName() {
		return "Crocodile";
	}
	
	public void eat() {
		System.out.println("Crocodile is eating");
	}
}	
