package fileHandling_in_Java.BufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderIntro {

	public static void main(String[] args) {
		
		
		
		char[] ch = new char[100];
		try {
//			FileReader reader= new FileReader("newFile.txt");
			//or
			Reader reader= new FileReader("newFile.txt");
			
			BufferedReader buffer= new BufferedReader(reader);
			buffer.read(ch);
			System.out.println(ch);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
