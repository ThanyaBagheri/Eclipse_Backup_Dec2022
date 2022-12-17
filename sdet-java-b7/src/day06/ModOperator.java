package day06;

public class ModOperator {
	public static void main(String[] args) {
		// % - mod or remainder operator
		// It calculates remainder after the division
		
		int num = 11;
		int numTwo = 3;
		
		//                  3 + 3 + 3 + 2
		//                  11 / 3 = 3 and 2 remains
		System.out.println(num / numTwo); 
		System.out.println(num % numTwo); // 2
		
		//                10 + 4
		//                14 / 10 = 1 and 4 remains
		System.out.println(14 / 10); // 1
		System.out.println(14 % 10); // 4
		
		//                 10 + 10 +  2
		//                 22 / 10 = 2 and 2 remains
		System.out.println(22 % 10); // 2
		
		//                 5 + 5 + 5 + 1
		//                 16 / 5 = 3 and 1 remains
		System.out.println(16 % 5); // 1
		
		System.out.println(12 % 2); // 0
		System.out.println(134 % 50); // 34
		
		//                 15 + 15 + 15 + 15 + 13
		//                 73 / 15 = 4 and 13 remains
		System.out.println(73 % 15); // 13
		System.out.println("------------");
		
		System.out.println(45 % 5); // 0        
		System.out.println(47 % 5); // 2
		System.out.println(45 % 20); // 5
		System.out.println(1001 % 1000); // 1
		System.out.println(12 % 9); // 3
		System.out.println(117 % 10); // 7
		System.out.println(17 % 10); // 7
		System.out.println(134 % 34); // 32
		System.out.println(26 % 5); // 1
	}
}