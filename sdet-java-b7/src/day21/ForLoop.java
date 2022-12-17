package day21;

public class ForLoop {
	public static void main(String[] args) {

//init part - we initialize counter variable
//condition - it keeps iterating while this true
//undate action - update counter variable so at some point condition will become false

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Hello,world!");
		}
		System.out.println("-----");

		// 1..100
		for (int i = 1; i < 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 100...1
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");

		}
	}
}
