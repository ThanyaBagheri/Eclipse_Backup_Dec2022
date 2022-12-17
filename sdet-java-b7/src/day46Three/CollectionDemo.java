package day46Three;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		list.add("John");
		list.add("Kuba");
		list.add("Ramesh");
		list.add("Alex");
		
		System.out.println(list);
	}
}
