package fileHandling_in_Java.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class File_Input_Stream {

	public static void main(String[] args) {
	
		byte[] arr= new byte[57];
		try {
			InputStream input = new FileInputStream("C:\\Users\\Ashu\\Desktop\\file\\newFile.txt");
		 System.out.println("Available bytes in file "+input.available());
		input.read(arr);
		String data= new String(arr);
		System.out.println(data);
		for(byte data1:arr) {
			System.out.println(data1);
		}
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
