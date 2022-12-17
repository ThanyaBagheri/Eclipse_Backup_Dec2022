package day26;

public class PersonDemo {
	public static void main(String[] args) {
		// Why objects?
		// Representing real life objects
		// the solid data types are not enough
		
		// What's class in java?
		// The class is blueprint or pattern for the objects 
		
		// What's object in java? and how does it work?
		// Object is instance(implementation) of the class
		
		//    10
		int number = 10;
		System.out.println(number); // 10
		
		//reference/address
		Person person = new Person();
		System.out.println(person); // day26.Person@7ad041f3
		person.name = "Alex";
		person.age = 35;
		person.address = "101 Main st";
		
		// What's constructor in java?
		// it is a special method to create an object
		// If we didn't define any constructors, java provides
		// default empty constructor
		
		Person personTwo = new Person("Alex", 35, "101 Main st");
		System.out.println(personTwo.name);  // Alex
		System.out.println(personTwo.age); // 35
		System.out.println(personTwo.address); // 101 Main st
		System.out.println("---");
		
		// the properties(instance variables) have default values
		// Objects - null (null means reference doesn't point to any object)
		// Numerics - 0
		// Boolean - false
		
		Person personThree = new Person("Bek", 30, "1 North st");
		System.out.println(personThree.name); // Bek
		System.out.println(personThree.age);
		System.out.println(personThree.address);
		
		System.out.println("---");
		Person personFour = new Person("Kuba");
		System.out.println(personFour.name); // Kuba
		System.out.println(personFour.age);  // 0
		System.out.println(personFour.address); // null
		System.out.println("---");
		
		Person personSix = new Person("Ramesh");
		System.out.println(personSix.name); // Ramesh
		System.out.println(personSix.age); // 0
		System.out.println(personSix.address); // null
	}
}




