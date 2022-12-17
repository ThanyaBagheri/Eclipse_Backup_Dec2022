package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AListInterview {
	public static void main(String[] args) {
		// ArrayList is based on array internally
		
		List<Integer> list = new ArrayList<>();
		// What's the default size of array that will be created 
		// when we create ArrayList?
		// By default ArrayList allocates array with size 10
		
		// Once we keep adding more elements and default array is not able to fit that
		// ArrayList will automatically increase size of its inner array
		
		for (int i = 1; i < 20; i++) {
			list.add(i);
		}
		System.out.println("size: " + list.size());
		System.out.println(list);
		
		// 10000 is initial size (capacity) of inner array
		List<Integer> listTwo = new ArrayList<>(10000);
		System.out.println("size: " + listTwo.size()); // size: 0
		
		// if we know that our ArrayList will holding big number of elements,
		// it is good idea to specify the initial size for inner array
		for (int i = 1; i <= 10001; i++) {
			listTwo.add(new Random().nextInt(101));
		}
		System.out.println("size: " + listTwo.size());
		System.out.println(listTwo);
	}
}
