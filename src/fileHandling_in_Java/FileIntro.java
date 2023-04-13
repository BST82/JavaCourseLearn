package fileHandling_in_Java;

import java.io.File;
import java.io.IOException;

public class FileIntro {

	public static void main(String[] args) {
		
		//using relative path
		File file = new File("C:\\Users\\Ashu\\Desktop\\file\\file1.txt");
		
		boolean result;

		try {
			 result= file.createNewFile();
			if(result) {
				System.out.println("file created successfully");
			}else {
				System.out.println("some error occured");
			}
		}catch(IOException e) {
			System.out.println("exception is accouring");
		}
	}

}
