package fileHandling_in_Java;

import java.io.File;
import java.io.IOException;

public class Create_file_using_absolute_path {

	public static void main(String[] args) {
		
		File file = new File("newFile.txt");
		
		
				try {
					boolean result= file.createNewFile();
					if(result) {
						System.out.println("file created successfully");
					}else {
						System.out.println("fail");
					}
				}catch(IOException e) {
					System.out.println("exception is accouring");
				}
	}

}
