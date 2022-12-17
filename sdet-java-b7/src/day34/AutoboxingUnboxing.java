package day34;

public class AutoboxingUnboxing {
	public static void main(String[] args) {
		//autoboxing: primitive -> wrapper class
		//unboxing: wrapper class -> primitive
		
		char ch = 'a';
		//Autoboxing (convert primitive (char) to wrapper class)
		Character chW = ch;
		System.out.println(chW);
		
		Integer numW =99;
		//Unboxing (wrapper class -> primitive)
		int num = numW;
		System.out.println(num);
	}	
}
