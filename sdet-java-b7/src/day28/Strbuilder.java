package day28;

public class Strbuilder {
	public static void main(String[] args) {
		//Create StringBuilder with empty value 
		StringBuilder sb = new StringBuilder();
		
		//add the value to StringBuilder by using append() method
		sb.append("hello");
		System.out.println(sb);// hello
		
		sb.append(", world");
		System.out.println(sb);// hello, world 
		
		sb.append("java");
		System.out.println(sb);// hello, worldjava
		
		//create StringBuilder with initial value
		StringBuilder city = new StringBuilder("Tokyo");
		System.out.println(city); //Tokyo
		
		city.append(" - population 37,400,068");
		System.out.println(city); 
		
		StringBuilder alphabet = new StringBuilder();
		for (char letter = 'a'; letter <= 'z'; letter++) {
			alphabet.append(letter);
		}
		System.out.println(alphabet);
		// The number of StringBuilder objects created is 1
	}			
}