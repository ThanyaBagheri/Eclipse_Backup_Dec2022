package Friday;

public class Loops {
	public static void main(String[] args) {
		// Java has three ways for executing the loops.
		// While all the ways provide similar basic functionality, they differ in their
		// syntax and condition checking time.

		// while loop: It is a control flow statement that allows code to be executed
		// repeatedly based on a given Boolean condition.
		// The while loop can be thought of as a repeating "if statement".

		// If the number of iterations is not fixed, it is recommended to use the while
		// loop
		// If the number of iterations is fixed, we can use for loop.

		int i = 1;
		while (i <= 6) {
			System.out.println("Hello, World!");
			i++; // update expression

			System.out.println();
		}

		int count = 10;
		while (count >= 1) {
			System.out.print(count + " "); // 10 9 8 7 6 5 4 3 2 1
			count--;
		}
	}
}
