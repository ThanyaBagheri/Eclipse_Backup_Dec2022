package day18;

public class StrNewmethods {
 public static void main(String[] args) {
	 //These methods are available from java 11 
	 
	//isBlank() returns true if string is empty or consist of white spaces only
	 String str = "   ";
	 System.out.println(str.isEmpty()); //false
	 System.out.println(str.isBlank());//true
	 
	 //repeat(int count) returns string value repeated count time 
	 String name = "John";
	 System.out.println(name);//John
	 
	 String nameRepeat = name.repeat(3);
	 System.out.println(nameRepeat);//JohnJohnJohn
	 
}
}
