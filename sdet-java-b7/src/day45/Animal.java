package day45;

public abstract class Animal {
	public String name;
	
	public void printDetails() {
		System.out.println("Animal details: "+ name);
	}
	
	public abstract void eat();
	
	public abstract void sleep();
	
}
