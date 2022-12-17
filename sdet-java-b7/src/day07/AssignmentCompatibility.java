package day07;

public class AssignmentCompatibility {
	public static void main(String[] args) {
		// int -> long -> float -> double
		long l = 500;
		float f = 55.99F;
		short sh = 123;
		
		//         long + float + short => float
		float result = l + f + sh;
		System.out.println(result);
		System.out.println(l + f + sh);
		// what's the data type of output from above expression?
		
		
		// byte -> short = always int
		// when byte and short is used in the math expression output will be int
		byte b = 5;
		short sh1 = 14;
		// byte + short = int
		int res = b + sh1;
		System.out.println(res);
		
		byte b1 = 10;
		byte b2 = 10;
		// byte + byte = int
		int result2 = b1 + b2;
		byte byteResult = (byte)(b1 + b2);
		System.out.println(result2);
		System.out.println(byteResult);
		
		short shNum = 100;
		short shNum2 = 100;
		// short + short = int
		int result3 = shNum + shNum2;
		short shortResult = (short)(shNum + shNum2);
		System.out.println(result3);
		System.out.println(shortResult);
	}
}