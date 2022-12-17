package day21;

import util.InputFromUser;

public class LogInDowhile {
	public static final String PASSWORD = "qwerty1$";
	public static final int ATTEMPTS = 3;
	
	
	public static void main(String[] args) {
		
		String enteredPassword;
		int numberOfAttempts = 0;
		
		do {
			enteredPassword = InputFromUser.getInput("Enter password:");
			numberOfAttempts++;
		} while (!PASSWORD.equals(enteredPassword)&&numberOfAttempts<ATTEMPTS);
		
		if (numberOfAttempts == ATTEMPTS && !PASSWORD.equals(enteredPassword)) {
			System.out.println("Your accout is blocked.");
	    }else {
		System.out.println("Welcome to your dashboard!");
	    }
	}
}
			
			
			
			
			
			
			






