package Alex;

public class validate_floormats {
	
	public static void main(String[] args) {
		//FROM CUSTOMER Searching for Floor Mats & Liners
		select_Parts("Interior");
		
		
	}
	
	public static void select_Parts(String parts) {
		
		switch (parts) {
		case "Auto Body Parts & Mirrors": 
			System.out.println("");
		break;
		case "Headlights & Lighting": 
			System.out.println("");
		break;
		case "Engine & Drivetrain": 
			System.out.println("");
		break;
		case "Brakes, Suspension & Steering": 
			System.out.println("");
		break;
		case "Interior": 
			System.out.println("Floor Mats & Liners");
		break;
		case "Exterior": 
			System.out.println("");
		break;
		case "Tools & Garage": 
			System.out.println("");
		break;
		case "Wheels & Tires": 
			System.out.println("");
		break;
		default:
			System.out.println("Item ia not avalible");
		}
	}
}
	

