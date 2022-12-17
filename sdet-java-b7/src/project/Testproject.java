package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testproject {
	public static void main(String[] args) {
		List<Permission> permissions = new ArrayList<>();
		permissions.add(new Permission("student", "b3 student", true));
		permissions.add(new Permission("student", "b1 student", false));
		permissions.add(new Permission("student", "b4 student", true));
		permissions.add(new Permission("student", "b2 student", true));
		permissions.add(new Permission("instructor", "b1 instructor", true));
		permissions.add(new Permission("instructor", "b2 instructor", false));
		permissions.add(new Permission("instructor", "b3 instructor", true));
		permissions.add(new Permission("admin", "site admin", true));
		permissions.add(new Permission("admin", "tla admin", false));
		permissions.add(new Permission("admin", "content editor", true));
		
		List<User> users = new ArrayList<>();
		users.add(new User(1, "John Doe", Arrays.asList(new String[] {"instructor", "admin"})));
		users.add(new User(2, "Alex Rodrigues", Arrays.asList(new String[] {"instructor"})));
		users.add(new User(3, "Mark Admana", Arrays.asList(new String[] {"student"})));
		
		project project = new project(permissions, users);
		
		System.out.println(project.listPermissions(1)); 
		// [b1 instructor, b3 instructor, site admin, content editor]
		
		System.out.println(project.checkPermitted("site admin", 1)); // true
		System.out.println(project.checkPermitted("b4 student", 1)); // false
	}
}
