package day29;

public class Score {
	public static void main(String[] args) {
		//Array is fixed collection of data (same type)
		
		int[] score = new int[5]; 
		//   0    1    2   3   4 
		//[ 70,  80  ,90 ,70, 60 ]   
		
		score[0] = 70;
		score[1] = 80;
		score[2] = 90;
		score[3] = 70;
		score[4] = 60;
				
		int num = score[1];
		System.out.println(num); //80
		
		System.out.println(score[0]); //70
		
		//assign last element as sum of first two elements
		score[4] = score[0]+score[1];
		System.out.println(score[4]);
		
		//array works with reference the same way as object reference
		//The actual array space will be create in heap memory
		System.out.println(score);//[I@ea30797
	}
}
