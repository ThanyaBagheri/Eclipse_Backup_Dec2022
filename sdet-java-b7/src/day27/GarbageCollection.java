package day27;

public class GarbageCollection {
	/*
	 * There are 3 ways to make an object eligible for GC
	 * When object doesn't have references, it is eligible for GC
	 * 1. Nullifying the reference(s) to the object.
	 * 2. Re-assigning the reference to point to the different object.
	 * 3. An object that was created inside the method.
	 */
	public static void main(String[] args) {
		// GC cleans up unused objects from the memory
		
		// 1. Nullifying the reference(s) to the object.
		Book b = new Book("A", "John", 30);
		
		// in java, null can be assigned to any references (non-primitive type)
		// to indicate that the reference doesn't point to any object.
		b = null;
		
		// 2. Re-assigning the reference to point to the different object.
		Book b2 = new Book("B", "Alex", 20);
		Book b3 = new Book("C", "Kuba", 25);
		
		b2 = b3;
		
		// 3. An object that was created inside the method.
		testMethod();
		
		// GC is 100% automatic process
		// We can only suggest do the clean up
		// there is no guarantee that request will run GC
		
		// #1. Using System class and gc() method
		System.gc();
		
		// #2. Using Runtime class and gc() method
		Runtime.getRuntime().gc();
		
		// What's finalize() method?
		// Just before destroying the object, GC call finalize() method
		// You can override this method for your object and put your custom clean up
	}
	
	public static void testMethod() {
		Book obj = new Book("C", "Bek", 20);
	}
}
