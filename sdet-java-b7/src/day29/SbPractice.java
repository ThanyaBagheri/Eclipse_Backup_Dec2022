package day29;

public class SbPractice {
	public static void main(String[] args) {
		System.out.println(buildAlphabet()); // ABCDEFGHIJKLMNOPQRSTUVWXY
		System.out.println("---");
		
		String res = getNumberStrRange(1, 10);
		System.out.println(res); // 12345678910
		
		res = getNumberStrRange(5, 15);
		System.out.println(res); // 56789101112131415
	}
	
	// TODO refactor this code?
	/*
	 * Generate alphabet
	 */
	public static String buildAlphabet() {
		
		
		StringBuilder sb = new StringBuilder();
		
		for (char ch = 'A'; ch < 'Z'; ch++) {
			sb.append(ch);					
		}
		return sb.toString();
	}
	
	/*
	 * getNumberStrRange(1, 10); -> "12345678910"
	 * getNumberStrRange(5, 15); -> "56789101112131415"
	 */
	public static String getNumberStrRange(int start, int end) {
		// TODO refactor this
		
		StringBuilder sb1 = new StringBuilder();
		
		for (int i = start; i <= end; i++) {
			sb1.append(i);
		}
		return sb1.toString();
	}
}

