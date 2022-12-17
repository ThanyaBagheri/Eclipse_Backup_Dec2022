package day13;

public class ConstVarPractice {
	
	public static final double MY_PERCENT = 17;
	
	public static double getPercentValue(int value) {
		return value * (MY_PERCENT/100);
	}
	
	public static double addPercentValue(int value) {
		return value + getPercentValue(value);
	}
	
	public static double minusPercentValue(int value) {
		return value - getPercentValue(value);
	}
	
	public static void main(String[] args) {
		System.out.println(getPercentValue(100)); // 17.0
		System.out.println(addPercentValue(100)); // 117.0
		System.out.println(minusPercentValue(100)); // 83.0
	}
}
