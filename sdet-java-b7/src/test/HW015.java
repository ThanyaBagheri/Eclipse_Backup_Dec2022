package test;

public class HW015 {

	public static void main(String args[]) {
		boolean isPlay = squirrelPlay(95, false);
		System.out.println(isPlay);
	}

	public static boolean squirrelPlay(int temp, boolean isSummer) {

		if (isSummer == false && temp >= 90) {
			return false;
		}
		
		else if (isSummer == true && temp >= 60 && temp <= 100) {
			return true;
		}
		/*
		if (isSummer = false && temp >= 60 && temp <= 90) {
			return true;

		}*/
	else {
			return false;
		}
	}
}
