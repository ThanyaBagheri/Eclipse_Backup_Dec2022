package Friday;

public class DoWhileLoop {
	public static void main(String[] args) {
		// do-while loop is an exit control loop.
		// Therefore, unlike for or while loop, a do-while check for the condition after executing the statements of the loop body.
		
		int i = 0;
		
		do {
			
			// Body of the loop that will execute minimum 1 time for sure no matter if it is true or false
			System.out.println("Print statement");
			i++;
		}
		
		// Checking condition
		// Note: It is being checked after minimum 1 iteration.
		while (i < 0);
		
		// Infinite loop: One of the common mistakes while implementing any sort of looping is that
		// it may not ever exit, that is the loop runs for infinite time.
		// This happens when the condition fails for some reason.
	}
}