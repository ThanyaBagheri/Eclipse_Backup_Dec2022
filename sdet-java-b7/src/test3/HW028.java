package test3;

public class HW028 {
	public static void main(String[] args) {

		System.out.println(catDog("xxcatxcattt"));
	}

	public static int catDog(String str) {
		// your code goes here
		int CountCat = 0;

		for (int i = 0; i < str.length()-2; i++) {
			String StrCat = str.substring(i,i+3);
			if (StrCat.equals("cat")) {
				CountCat++;
			}
		}
		return CountCat;
	}
}
