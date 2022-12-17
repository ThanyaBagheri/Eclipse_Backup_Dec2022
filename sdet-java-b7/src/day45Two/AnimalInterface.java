package day45Two;

public interface AnimalInterface {
	// public String name;
	// interface can have only public static final const class level variables
	public static final int MAX_AGE = 100;
	public static final int MIN_AGE = 1;
	
	// public static final is assumed keywords, they will inserted by compiler. 
	//It is optional to specify
	String TYPE = "mammal";
	
	public abstract void eat();
	public abstract void sleep();
	
	// public abstract is assumed keywords for methods in Interface
	void drink();
	
	// Interface cannot have non abstract methods except default and static
//	public void run() {
//		System.out.println("Animal is running");
//	}
	
	// What methods can have bodies in the Interface?
	// static and default methods can have body in the interface
	public static void printInFormat(String animalName) {
		System.out.println("Animal's name is " + animalName);
	}
	
	public default void run() {
		System.out.println("Animal is running");
	}
}
