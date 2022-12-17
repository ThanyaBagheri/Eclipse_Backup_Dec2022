package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BuiltInLambdaExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(2, 1, 3, 4));
		System.out.println(list);
		
		// What's Lambda in Java?
		// It is feature of java that lets us to pass a method
		// as an argument to the method (anonymous method)
		
		list.forEach(e -> System.out.println(e));
       // System.out.println();
		
//		list.removeIf((Integer element) -> {
//			return element % 2 == 0;
//		});
		
		list.removeIf(e -> e % 2 == 0);
		System.out.println(list);
		
		list.replaceAll(e -> e * 2);
		System.out.println(list);
		System.out.println(list);
		List<Integer> res = changeList(list, e -> e * 2);
		System.out.println(res);
		
		res = changeList(list, e -> e / 2);
		System.out.println(res);
	}
	
	public static List<Integer> changeList(List<Integer> list, Function<Integer, Integer> function) {
		List<Integer> res = new ArrayList<>();
		for (Integer element : list) {
			res.add(function.apply(element));
		}
		return res;
	}
}