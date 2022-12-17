package test4;

import java.util.ArrayList;
import java.util.List;

public class Project {
	public static void main(String[] args) {
		TLAClass tla = new TLAClass();
	
		List<String>students = new ArrayList<>();
		students.add("B");
		
		tla.setListOfStudets(students);
		System.out.println(tla.getListOfStudents());
		
	}
	
}
