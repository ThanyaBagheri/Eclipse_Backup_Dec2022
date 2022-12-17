package day07;

public class ConvertStrToNumeric {
	public static void main(String[] args) {
		String strNum = "2344";

		// to convert numeric String to int
		// we need to use Integer.parseInt(stringToConvert)

		// "2344" became int
		int num = Integer.parseInt(strNum);	
		System.out.println(num);
		System.out.println(num * 2);

		String strNumber2 = "10.5";
		double dNum = Double.parseDouble(strNumber2);
		System.out.println(dNum);
		
		byte bNum = Byte.parseByte("15");
		short shNumber = Short.parseShort("50");
		int intNumber = Integer.parseInt("100");
		long longNumbe = Long.parseLong("1000000");
		float floatNumber = Float.parseFloat("1.99");
		double doubleNum = Double.parseDouble("100.99");		
	}
}
