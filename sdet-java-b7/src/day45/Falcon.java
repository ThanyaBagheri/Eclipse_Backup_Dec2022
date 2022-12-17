package day45;

/*
 * What is abstraction in Java?
 * When we focus on what object does instead of how it does it.
 * 
 * How we can achieve abstraction in Java?
 * 1. By using abstract class
 * 2. By using interface
 * 
 * Abstract class vs Interface?
 * 
 */
public abstract class Falcon extends Bird {
	public int age;
	
	public abstract void hunt();
	
	public void printDetails() {
		System.out.println("Falcon details");
		System.out.println(age);
	}	
}
