package day10;

public class Greater {
	public static void main(String[] args) {
		double res = greater100(200);
		System.out.println(res);
		
		res = greater100(2.2);
		System.out.println(res);

	}

	public static double greater100(double dNum) {

		if (dNum > 100.0) {
			return dNum;
		} else {
			return 100.0;
		}
	}
}
