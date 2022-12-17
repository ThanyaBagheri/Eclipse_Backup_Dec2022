package day30;

public class ArrayReviewTwo {
	public static void main(String[] args) {
		//go over the array with loop
		String[] names = {"Uran", "Nika", "Ravan", "Daria", "Paul", "Mehmet"};
		
		//find out total number of characters in the array?
		
		int numberOfTotalChars = 0;
		for (int i = 0; i<names.length;i++) {
			String element = names[i];
			int singleNameSize = element.length();
			numberOfTotalChars += singleNameSize; 
		}
		System.out.println("Total number of chars: "+ numberOfTotalChars);
	}

}
