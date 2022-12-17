package day15;

public class StrUpperLowerCase {
	public static void main(String[] args) {
		//toUpperCase()
		//toLowercase()
		
		String str = "Java";
		System.out.println(str);
		
		str = str.toUpperCase();
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println("---------");
		
		String name = "John Doe";
		System.out.println(name);//John Doe
		
		System.out.println(name.toUpperCase());//JOHN DOE
		//just print but not re assign
		// to reassign: name= name.toUpperCase();
		
		System.out.println(name);//John Doe 
	}
}
