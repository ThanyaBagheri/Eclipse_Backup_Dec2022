package day09;

public class Review2 {
	public static void main(String[] args) {
		//Increment and Decrement operators
		int age = 10;
		
		age++; //increment increase valur by 1
		
		System.out.println(age);//11
		
		age--; //decrement decrease value by 1
		System.out.println(age);//10
		
		// Post & Pre
		// post decrement/ increment - effect next line.
		// pre -applied right away.
		
		int number = 77;
		System.out.println(number++ + " " + number);//77 78
		
		System.out.println(++number);//79
		System.out.println(number);//79		
	}
}
