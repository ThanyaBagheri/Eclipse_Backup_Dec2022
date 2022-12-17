package day07;

import util.InputFromUser;

public class Multiply {
	public static void main(String[] args) {
		String numStr1 = InputFromUser.getInput("Enter num1");
		String numStr2 = InputFromUser.getInput("Enter num2");

		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		int result = num1 * num2;

		System.out.print(num1 + "*" + num2 + "=" + result);

	}
}
