package fileHandling_in_Java.inputStream.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public int empid;  //sate
	public String empName; //state
	
	Employee(int id,String n){   //behavior 
		this.empid=id;
		this.empName=n;
	}
}


public class SerializationIntro {

	public static void main(String[] args) {
		
		Employee emp =new Employee(101,"Arjun");
		
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\Ashu\\Desktop\\file\\SerializedFile.txt");
		   ObjectOutputStream objectWriter= new ObjectOutputStream(output);
		   objectWriter.writeObject(emp);
		   System.out.println("Object serialization achieve");
		   
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
			
		
		
		
	}

}
