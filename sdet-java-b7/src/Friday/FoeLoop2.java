package Friday;

public class FoeLoop2 {
	public static void main(String[] args) {
		String str = "Good evening, world";
		
		for (int i=0; i< str.length(); i++) {
			System.out.print(str.charAt(i)); // Good evening, world
			
			System.out.println();
		}
		//Reverse
		String saying = "Java is perfect.";
		
		for (int i = saying.length()-1; i >=0; i--) {
			System.out.print(saying.charAt(i)); //.tcefrep si avaJ
		}
		
	}
}
