package day30;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 10, 11, 13, 100, 20, 60, 70, 15, 14 };
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > 50) {
				System.out.println(numArr[i]);
			}
		}
		System.out.println("-----");

		for (int i : numArr) {
			if (i > 50) {
				System.out.println(i);
			}
		}

	}

}
