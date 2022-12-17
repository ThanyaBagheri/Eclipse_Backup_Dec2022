package test2;

public class project3 {
	public int getNumberOfLetters(String str) {
    	// implement method and return number of letter in str(white space is not a letter)
      	
		return noWhiteSpaces(str).length();
    }
  
  	public String transform(String str) {
    	// if length of str is even return upper case version of it
        // if length of str is odd return lower case version of it
    if (getNumberOfLetters(str)%2==0){	
      return str.toUpperCase();
    }else{	
      return str.toLowerCase();
    }
    }
  
  	public String noFirstAndLast(String str) {
    	// return str without first and last letters.
        // if str length is less than 2 return str without changes
    if (getNumberOfLetters(str)>=2){
      return str.substring(1,getNumberOfLetters(str)-1);
    }else{  
      return str;
    }
  	}
    public String injectVariable(String content, String key) {
    	// { and } special characters
        // content variable will have one {} string
        // your job to find that and replace with kye variable value
        // ex: injectVariable("Hello {name}, how are you?", "Bob");
        // return: "Hello Bob, how are you?"
        // Note: Instead of 'name' could be anything. It's going to have only one '{anything}' substring in the content
    	int beginIndex = content.indexOf('{');
        int endIndex = content.indexOf('}');
        String sub = content.substring(beginIndex, endIndex+1);
       
        return content.replace(sub, key);
    }
    
    public char getLastLetter(String str) {
    	// return last char from str variable
      	return str.charAt(str.length()-1);
    }
  
  	public boolean isFirstUpperCase(String str) {
    	// if str has as first letter uppec case char return true otherwise false
        // it can any upper case letters
        String strF = str.substring(0,1);
      	return strF.equals(strF.toUpperCase());
    }
  
  	public String noWhiteSpaces(String str) {
    	// return str without white spaces
      	return str.replace(" ","");
    }
  
  	public boolean isIdentical(String str, String str1) {
    	// return true if str and str1 are same. Case sensitive
      	return str.equals(str1);
    }
  	
  	public boolean isSame(String str, String str1) {
    	// return true if str and str1 are same. Not case sensitive
      	return str.equalsIgnoreCase(str1);
    }
  
  	public String apple(String str) {
    	// if str contains "apple" return "apple" otherwise return str
      	if (str.contains("apple")){
          return "apple";
        }
      return str;
    
} 
}
