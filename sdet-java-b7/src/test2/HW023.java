package test2;

public class HW023 {
	public static void main (String[]args) {
	//System.out.println(countCode("aaacodebbb"));// → 1
	//System.out.println(countCode("codexxcode")); // → 2
	//System.out.println(countCode("cozexxcope"));// → 2
	System.out.println(countCode("xxcozeyycop"));// → 1
	}
	
	public static int countCode(String str) {
	//	  int len = str.length();
	//	  int count = 0;
		  
	//	  for (int i = 0; i<len-3; i++){
	//	  if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e'); 
	//	  }
	//	  return count;
	//	}
		
	
			  int count = 0;
			  
			  for (int i = 0; i<str.length()-3; i++){
			  if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e')
			  count++;
			  }
			  return count;
			}
	}


