package day46Two;

public class ZooWorker {
	public static void main(String[] args) {
		Reptile reptileC = new Crocodile();
		feed(reptileC);
		
		Reptile reptileA = new Alligator();
		feed(reptileA);
	}
	
	public static void feed(Reptile reptile) {
		System.out.println("Feeding " + reptile.getName());
	}
}
