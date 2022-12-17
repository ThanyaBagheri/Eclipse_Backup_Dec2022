package day28;

public class ImmutableString {
	public static void main(String[] args) {
		//String is immutable object that can hold sequence of characters between double quotes
		//immutable object - not changeable. Once we created string object,
		//there is no way to change the initial value of that object.
		
		String str = "apple";
		System.out.println(str);
		
		str = "banana"; // ->reassign (create new string obj in string pool)
		System.out.println(str);
		
		String str2 = "";
		for (int i =0; i<50; i++) {
			str2 =str2 + i;
		}
		System.out.println(str2);
		// How many String objects we create from line 16 till 20?
		// --> 51 obj
		// Every String change will create new object. //""
		                                               //"0"
		                                               //"01"
		                                               //"012"..... and so on
	}
}
