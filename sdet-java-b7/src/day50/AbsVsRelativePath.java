package day50;

import java.io.File;

public class AbsVsRelativePath {
	public static void main(String[] args) {
		
	//Absolute file path is a path from root directory to your specific file 
	File myNotes = new File("/Users/thanyaratsaengsing/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
	System.out.println("file exists: " + myNotes.exists()); //file exists: true
	System.out.println(myNotes.getAbsolutePath()); ///Users/thanyaratsaengsing/eclipse-workspace/sdet-java-b7/src/day50/notes.txt
	
	//Relative file path is a path from the place where code is running to your specific file
	File myNotesRelativePath = new File("src/day50/notes.txt");
	System.out.println("file exists: " + myNotesRelativePath.exists());
	System.out.println(myNotesRelativePath.getAbsolutePath());	
	}
}
