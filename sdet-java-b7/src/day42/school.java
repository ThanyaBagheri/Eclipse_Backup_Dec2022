package day42;

import java.util.ArrayList;
import java.util.List;

// Create immutable object
public class school {
	private String name;
	private List<String> courses;
	private String address;
	
	public school(String name, List<String> courses, String address) {
		this.name = name;
		this.courses = new ArrayList<>(courses);
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getCourses() {
		return new ArrayList<>(courses);
	}
	
	public String getAddress() {
		return address;
	}
}
