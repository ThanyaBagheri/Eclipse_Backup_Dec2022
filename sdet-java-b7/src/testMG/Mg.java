package testMG;

public class Mg {
public static void main(String[] args) {
		
String input = "today";
int n = 0;

while (n < input.length()) {
	n++;
	
	if (n%2==1) {
		continue;
		
	}

System.out.println(input.charAt(n));
}	
}
}



