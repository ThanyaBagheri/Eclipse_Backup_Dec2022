package project;

import java.util.ArrayList;
import java.util.List;

public class project {
	List<Permission> permissions;
	List<User> users;

	public project(List<Permission> permissions, List<User> users) {
		this.permissions = permissions;
		this.users = users;
	}

	/**
	 * We want to be able to get a list of all permissions that particular user has.
	 * A user has any permission that matches one of the roles that they have.
	 * 
	 * Write a function that takes a user id and returns the list of strings
	 * matching the names of permissions that user has. If the user or cannot be
	 * founded or user has no permissions, then return empty list.
	 * 
	 * Additionally, each permission is either active or inactive, and we should not
	 * return permissions that are inactive.
	 * 
	 */
	public List<String> listPermissions(int userId) {

		List<String> userRoles = new ArrayList<>();
		for (User user : users) {
			if (userId == user.id) {
				userRoles = user.roles;

			}
		}

		List<String> permission = new ArrayList<>();
		for (Permission userPermission : permissions) {

			if (userRoles.contains(userPermission.role) && userPermission.active) {
				permission.add(userPermission.name);
			}
		}
		return permission;
	}

	/**
	 * We also want to be able to ensure that users aren't trying to use permissions
	 * they don't have.
	 * 
	 * Write a function that takes a user id and permission name and returns true if
	 * the user has that permission. Return false otherwise. The rules for whether a
	 * user has a permission are the same as the List Permissions function
	 * (including active/inactive handling). If the user or permission cannot be
	 * found, return false
	 */
	public boolean checkPermitted(String permissionName, int userId) {
		List<String> userPermissions = listPermissions(userId);
		if (userPermissions.contains(permissionName)) {
			return true;
		} else {
			return false;
		}

	}
}

class Permission {
	public String role;
	public String name;
	public boolean active;

	public Permission() {
	}

	public Permission(String role, String name, boolean active) {
		this.role = role;
		this.name = name;
		this.active = active;
	}
}

class User {
	public int id;
	public String name;
	public List<String> roles;

	public User() {
	}

	public User(int id, String name, List<String> roles) {
		this.id = id;
		this.name = name;
		this.roles = roles;
	}
}
