package day29;

public class StrBuffer {
	public static void main(String[] args) {
		// StringBuilder vs StringBuffer?
		// StringBuffer is thread safe and StringBuilder is not
		// StringBuilder is faster and StringBuffer is slower
		
		StringBuffer sbf = new StringBuffer();
		
		for (char ch = 'a'; ch < 'z'; ch++) {
			sbf.append(ch);
		}
		
		System.out.println(sbf);
	}
}
