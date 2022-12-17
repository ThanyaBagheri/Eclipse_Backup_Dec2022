package test;

public class HW001 {

	public static void main(String[] args) {
		      // int amount = Integer.parseInt(args[0]); 
		       int amount = 87;
		      
		       
		       System.out.println("Quarters: " + amount / 25);
		       int remainderOfquarter = amount%25;
		       
		       System.out.println("dimes: " + remainderOfquarter / 10);
		       int remainderOfdimes = remainderOfquarter%10;
		       
		       System.out.println("nickels: " + remainderOfdimes / 5);
		       int remainderOfnickles = remainderOfdimes%5;
		       
		       System.out.println("pennies: " + remainderOfnickles / 1);
		       
		    		  
		    		   
		      // System.out.println("nickle: " + amount / 5);
		      // System.out.println("pennies: " + amount / 1);
		      
		       
		      /* 
		       int quarters = amount / 25;
		       int dimes = amount % 10;
		       int nickle = amount % 5;
		       int pennies = amount % 1;
		       System.out.println(amount);
		       */
	}
}
