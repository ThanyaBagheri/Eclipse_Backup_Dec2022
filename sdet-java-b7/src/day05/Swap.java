package day05;

public class Swap {
	public static void main(String[] args) {
		String sky = "yellow";
		String sun = "blue";
		String tmp;
		// TODO swap values of these two variables without direct reassignment.
		// One more extra variable
		
		tmp = sky;
		sky = sun;
		sun = tmp;
				
		System.out.println("Sky is " + sky); // Sky is blue
		System.out.println("Sun is " + sun); // Sun is yellow	
	}
}
