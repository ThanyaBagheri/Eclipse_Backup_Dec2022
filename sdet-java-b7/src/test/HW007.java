package test;

public class HW007 {
	public static void main(String[] args) {
		System.out.println(min(90, 9, 39));
	}

	public static int min(int a, int b, int c) {
		/*
		int time = 22;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		*/
		
		if (a <= b) {
			return a;
		}
		else if (a <= c) {
			return a;
		}
		else if (b <= c) {
			return b;
		}else return c;
		
		/*
		if (a < b) {
			if (a < c) {
				return a;
			} else
				return c;
		} else {
			if (b < c) {
				return b;
			} else
				return c;
		*/
		
	}
}
			
			
		
	

	


