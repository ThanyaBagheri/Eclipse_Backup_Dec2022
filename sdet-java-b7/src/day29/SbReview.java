package day29;

public class SbReview {
	public static void main(String[] args) {
		//What's the difference between String and StringBuilder?
		//-String is immutable but StingBuilder is mutable object
		//-Every change of String requires new object so if we have code 
		// that has many string changes it is better to use StringBuilder
		
		StringBuilder sb = new StringBuilder("A");
		sb.append("B");
		sb.append("C");
		System.out.println(sb);
		
		System.out.println("size: "+ sb.length());
		
		//insert(index, value);
		sb.insert(0, "X");
		System.out.println(sb);
		
		sb.insert(2, "O");
		System.out.println(sb);
		
		
		//delete(start, end);
		sb.delete(2, 4);
		System.out.println(sb);
		
			
	}
}
