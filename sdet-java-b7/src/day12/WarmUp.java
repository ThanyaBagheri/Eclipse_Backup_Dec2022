package day12;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(getEvenOddMsg(10));// odd
		
		System.out.println(getEvenOddMsg(2));// even
		System.out.println(getEvenOddMsg(4));// even
		System.out.println(getEvenOddMsg(10));// Ten
		
	}

	public static String getEvenOddMsg(int num) {
		if (num==10) {
			return "Ten";
		} else {
			if (num%2==0) {
				return "even";
			}
			else {
				return "odd";

			}
		}
	}
	}	




