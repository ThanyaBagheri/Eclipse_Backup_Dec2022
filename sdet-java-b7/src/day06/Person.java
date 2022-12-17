package day06;

public class Person {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		int age = 35;

		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);

		System.out.println(age + 10); // 45
		System.out.println(age); // 35
		// = 35 + 10
		age = age + 10;
		System.out.println(age); // 45

		firstName = "Alex";
		lastName = "Rodriguez";
		age = age - 20;

		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);

	}
}
