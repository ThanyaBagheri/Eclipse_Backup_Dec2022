package test3;

public class HW038 {
	public static void main(String[] args) {
		String res = repeatEnd("hello",1);
		System.out.println(res);
	
	}
	public static String repeatEnd(String str, int n) {
		  int len = str.length();
		  String res = "";
		  
		  for (int count=1; count<=n;count++){
			 res = res + str.substring(len-n,len);
		  }
		  
		  return res;
		  }
		}

	
