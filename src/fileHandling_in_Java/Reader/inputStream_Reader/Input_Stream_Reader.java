package fileHandling_in_Java.Reader.inputStream_Reader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class Input_Stream_Reader {

	public static void main(String[] args) {
		
				
				char[]arr= new char[100];
				try {
					//hundandle exception checked exception
					/* f is input stream object*/
					FileInputStream f= new FileInputStream("newFile.txt");
					
					InputStreamReader r = new InputStreamReader(f);
                     r.read(arr);
					System.out.println(arr);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				
			}

		

	}


