package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class NameList {
	public static void main(String[] args) {
		//Arraylist
		
		//Array is fixed sized collection of variables
		//- fixed size
		//- it can work with primitives and objects
		
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		//name[3] = "Kuba";
		System.out.println(Arrays.toString(names));
		System.out.println(names[0]);//John
		names[2] = "Ramesh";
		System.out.println(Arrays.toString(names));
		
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("John");
		namesList.add("Bob");
		namesList.add("Alex");
		namesList.add("Kuba");
		System.out.println(namesList);
		
		System.out.println(namesList.get(0));//John
		String name = namesList.get(3);
		System.out.println(name);//Kuba

		namesList.set(2, "Ramesh");
		System.out.println(namesList);
	}
}
