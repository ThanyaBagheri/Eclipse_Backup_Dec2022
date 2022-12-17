package project;

public class project5 {

	public static void main(String[] args) {
		// Note, these examples don't cover full test cases.
		creditCardCheck("378282246310005"); // AMEX
		creditCardCheck("4012888888881881"); // VISA
		creditCardCheck("-5105105105105100"); // MASTERCARD
		creditCardCheck("123"); // INVALID
	}

	public static void creditCardCheck(String creditCard) {
		if (creditCard.contains("-")) {
			System.out.println("INVALID");
		}

		int[] num = new int[creditCard.length()];
		for (int i = 0; i < creditCard.length(); i++) {
			num[i] = Integer.parseInt(creditCard.substring(i, i + 1));
		}

		int sum = 0;
		for (int i = num.length - 2; i >= 0; i = i - 2) {
			int even = num[i] * 2;
			if (even >= 10) {
				int right = even / 10;
				int left = even % 10;
				sum += right + left;
			} else {
				sum += even;
			}
		}

		for (int i = num.length - 1; i >= 0; i = i - 2) {
			sum += num[i];
		}

		if (sum % 10 != 0) {
			System.out.println("INVALID");
		} else {
			if (num[0] == 3 && (num[1] == 4 || num[1] == 7)) {
				System.out.println("AMEX");
			}
			if (num[0] == 5 && (num[1] == 1 || num[1] == 2 || num[1] == 3 || num[1] == 4 || num[1] == 5)) {
				System.out.println("MASTERCARD");
			}
			if (num[0] == 4) {
				System.out.println("VISA");
			}
		}
	}
}
