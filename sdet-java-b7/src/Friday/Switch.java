package Friday;

public class Switch {
	public static void main(String[] args) {
		
		// the switch statement is a multi-way branch statement.
		// In simple word, the Java switch statement from multiple conditions.
		//It is like "if-else-if" ladder statement.
		
		//Syntax for switch statement:
		
		//switch (expression) {
		//case statements
		//values must be of same type of expression
		//case 1: 
			//statements
		//	break;//break is optional
		//case 2:
			//statements 
			//break;//break is optional
			
		//We can have any number of case statements
		//below is default statement, used when none of the case is true
		//No break is needed in the default case.
		//default:
			//statements
			
		//The break statement is used inside the switch to terminate sequence.
		//the break is optional. If omitted, execution will continue on into nect case.
			
			int day = 3;
			String dayString;
			
			switch(day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			case 4:
				dayString = "Thursday";
				break;
			case 5:
				dayString = "Friday";
				break;
			default:
				dayString = "Invalid day";
			}	
			
			System.out.println(dayString);
		
		}
	}

