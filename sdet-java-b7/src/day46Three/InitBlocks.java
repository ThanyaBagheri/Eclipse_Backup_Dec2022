package day46Three;

public class InitBlocks {
	public static String str;
	public String strTwo;
	public String strThree;
	
	// static block
	// Static block gets executed once when
	// we use this class.
	static {
		System.out.println("in static block");
		str = "Static block";
		// strTwo = "Abc";
	}
	
	// init block
	// it runs before the constructor call
	{
		System.out.println("in init block");
		strTwo = "init block";
		System.out.println("get data from API for this user");
	}
	
	public InitBlocks() {
		System.out.println("in constructor");
	}
	
	public InitBlocks(String str) {
		System.out.println("in constructor");
	}
}
