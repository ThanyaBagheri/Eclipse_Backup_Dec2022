package test3;

public class HW039 {
	public static void main(String[] args) {
		System.out.println(xyBalance("aaxbb"));

	}

	public static boolean xyBalance(String str) {

		int whereX = 0;
		int whereY = 0;

		for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'x') 
					whereX = i; 
				
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == 'y') 
					whereY = j;
				}
			}
		

		if (whereX <= whereY) {
			return true;
		}

		return false;
	}
}

