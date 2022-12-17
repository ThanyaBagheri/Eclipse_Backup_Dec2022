package day20;

public class WhileLoopTwo {
	public static void main(String[] args) {
		// Print numbers from 1 till 1000 in the same line
		// 1 2 3 4 5 6 7 8 9 ... 1000
		
		
		int count = 1;
		while (count <= 1000) {
			System.out.print(count + " ");
			count++;
		}
		//Which value exit the loop -> check
		System.out.println("Here:"+count); //Here:1001
		
		System.out.println("-------------");
		
		//I want to print number from 10 till 1 inclusive
		// 10 9 8 7 6 ..1
		
		int index = 10;
		while (index >=1) {
			System.out.print(index + " ");
			index--;
		}
		System.out.println("index: " + index);//index:0
	}
}
