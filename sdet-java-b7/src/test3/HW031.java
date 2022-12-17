package test3;

public class HW031 {
	public static void main(String[] args) {
		boolean res = xyzThere("xyz");
		System.out.println(res);
	}

	public static boolean xyzThere(String str) {

		if (str.length() >= 3 && str.substring(0, 3).equals("xyz")) {
			return true;
		}
		for (int i = 1; i < str.length() - 2; i++) {

			if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) {
				return true;

			}
		}
		return false;
	}
}

//if (str.contains(".xyz")){
//    return false;
//  }else if (str.contains("xyz")){
//    return true;
//  }else{
//    return false;
//  }
