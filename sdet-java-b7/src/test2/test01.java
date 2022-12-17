package test2;

public class test01 {
	public static void main(String[] args) {
		System.out.println(doubleChar("Prim"));
	}
	
	
	public static String doubleChar(String str) {
		//  int len = str.length();
		  
		  String newstr = "";
		  for (int i = 0; i < 1; i++) {
		    newstr += str.substring(i,i+1) + str.substring(i, i+1) + str.substring(i, i+1);
		  }
		  return newstr;
		}
}

