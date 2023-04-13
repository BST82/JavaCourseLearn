package fileHandling_in_Java.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutPutStreamIntro {

	public static void main(String[] args) {
		
		String data="I am currently using OutputStream";
		try {
			OutputStream output=new FileOutputStream("C:\\Users\\Ashu\\Desktop\\file\\newFile.txt");
		byte[] databytes= data.getBytes();
		output.write(databytes);
	
//		output.write(65);
//		output.write(66);
//		output.write(67);
		System.out.println("Writing operation done");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
