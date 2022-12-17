package day49;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyKeyword {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/day49/note.txt"));
			
			String line = br.readLine();
			System.out.println(line);			 
			br.close();
			System.out.println("File read is done");

			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		
		}finally {
			//finally block always runs
			try {
				br.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("File read is done");
		}
	}
}
