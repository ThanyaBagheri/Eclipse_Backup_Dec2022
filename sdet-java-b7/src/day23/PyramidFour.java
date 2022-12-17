package day23;

public class PyramidFour {
	public static void main(String[] args) {
		int pyradimLevel = 5;
		
		String hash = "#";
		String displayLevel = "";
		
		for (int i = 0; i < pyradimLevel; i++) {
			displayLevel += hash;
		}
		
		// displayLevel = "#####"
		for (int i = 0; i < pyradimLevel; i++) {
			System.out.println(displayLevel.substring(0, displayLevel.length() - i));
		}
	}
}
