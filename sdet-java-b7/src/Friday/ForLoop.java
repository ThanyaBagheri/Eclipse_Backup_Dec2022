package Friday;

public class ForLoop {
	public static void main(String[] args) {
		
		// for loop: It provides a concise way of writing the loop structure
		// The "for statement" consumes the initialization, condition and increment /decrement in one line
		// therefore providing a shorter, easy to debug structure of looping
		
		for (int i = 1; i<=10; i++) {
			System.out.print(i + " "); // 1 2 3 4 5 6 7 8 9 10 
			
			System.out.println();
		}
		
		int sum = 0;
		
		for (int x =1; x<=10; x++) {
			sum = sum + x;
		}
		System.out.println("The sum: " + sum);//The sum: 55
		
	}
}
