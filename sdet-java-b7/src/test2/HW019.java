package test2;

public class HW019 {
	public static void main(String[] args) {
    	printScore('A');
    }
  
  	public static void printScore(char grade) {
    	// your code goes here. Make sure to use switch statement
    switch(grade){
      case 'A':
        System.out.println("Your score is within 90 - 100");
        break;
      case 'B':
        System.out.println("Your score is within 65 - 90");
        break;
      case 'C':
        System.out.println("Your score is within 50 - 65");
        break;
      case 'F':
        System.out.println("Your score is less than 50");
        break;
      default:
        System.out.println("Invalid grade");
    }
}
}

