package day50;

public class FileCountDemo {
	public static void main(String[] args) {
		FileCounter counter = new FileCounter();
		int numberOfFile = counter.countFiles("src");
		System.out.println("files in 50 packages: " + numberOfFile);
		
		
		FileCounter counterTwo = new FileCounter();
		int nFiles = counterTwo.countFiles("/Users/thanyaratsaengsing/Desktop");
		System.out.println(nFiles);
	}
}
