package test3;

public class HW027 {
	public static void main(String[] args) {
		
    boolean res = catDog("catxdogxdogcat");
    System.out.println(res);
}

public static boolean catDog(String str) {
    // your code goes here
	int CountCat =0;
	int CountDog =0;
	
	for (int i = 0; i<str.length()-2;i++) {
		if (str.substring(i,i+3).equals("cat")) {
			CountCat++;
		}
	}
	for (int i = 0; i<str.length()-2;i++) {
		if (str.substring(i,i+3).equals("dog")) {
			CountDog++;
}
	}
		return CountCat==CountDog;
	}
}

////if (str.length()>2){
////return str.contains("cat") && str.contains("dog");
////}else{
////  return true;
//	
		
	


