package day29;

public class Temperature {
	public static void main(String[] args) {
		double[] temp = {32.1, 30, 25.7, 26, 34, 31.5, 29};
		
		double totalSum = 0.0;
		//TODO find out sum of element in temp array
		for (int i =0; i < temp.length; i++) {
			totalSum += temp[i];
		}
		
		
		double averageTemp = 0.0;
		//TODO find out average temp (total/size)
		averageTemp = totalSum / temp.length;
		
		System.out.println("Total sum: " + totalSum);
		System.out.println("Average temperature: " + averageTemp);
	}
}
