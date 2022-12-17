package day29;

public class Rainbow {
	public static void main(String[] args) {
		String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
		
		
		//loop over(read each element one by one) the array by using for loop
		for (int i = 0; i< color.length; i++) {
			System.out.println(color[i].toUpperCase());
		}
	}
}
