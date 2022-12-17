package day50;

import java.io.File;
import java.io.IOException;

public class FilePracticeTwo {
	public static void main(String[] args) {
		// how to crate new directory?
		File newDir = new File("src/day50/sdet");
		
		if (!newDir.exists()) {
			//creating new directory if does't exist
			newDir.mkdir();			
		}else {
			System.out.println("Already exist");
		}
		
		System.out.println(newDir.getAbsolutePath());
		try {
			File f1 = new File(newDir.getAbsoluteFile() + "/oop.pdf");
			f1.createNewFile();
			
			File f2 = new File(newDir.getAbsoluteFile() + "/slides.pdf");
			f2.createNewFile();
			
			File f3 = new File(newDir.getAbsoluteFile() + "/cat.png");
			f3.createNewFile();
			
			System.out.println("Created new files");
			
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
