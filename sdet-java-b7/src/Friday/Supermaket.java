package Friday;

public class Supermaket {
	public static void main(String[] args) {

		String product = "coke";
		double price = 0.0;

		switch (product) {
		case "banana":
			price = 2.22;
			break;
		case "water":
			price = 1.99;
			break;
		case "orange":
			price = 1.55;
			break;
		case "coke":
			price = 1.77;
			break;

		default:
			System.out.println("Invalid product");
		}

		System.out.println("Product: " + product);
		System.out.println("Price: " + price);

	}
}
