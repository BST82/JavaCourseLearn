package fileHandling_in_Java.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutput_StreamPart2 {

	public static void main(String[] args) {
		String data="writing in anew file.\nThis is second line";
		
		try {
		OutputStream output = new FileOutputStream("C:\\Users\\Ashu\\Desktop\\file\\newFile2.txt");
		byte[] arr= data.getBytes();
		output.write(arr);
		System.out.println("Data written successfully.");
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
