package day16;

public class StrReview {
public static void main(String[] args) {
	String str = "Good morning!";
	int len = str.length();
	System.out.println(str);
	System.out.println(len);
	
	//toUpperCase() converts value to all upper cases and returns it as new string
	
	//toUpperCase() converts value to all lower cases and returns it as new string
	
	String name = "Kuba";
	
	//String is immutable object and the methods  of string will not change original value 
	//only way to change it, to reassigning the value
	System.out.println(name.toUpperCase());//KUBA
	System.out.println(name);//KUBA
	
	name = name.toUpperCase();
	System.out.println(name);
	System.out.println(name.toLowerCase());
	
}
}
