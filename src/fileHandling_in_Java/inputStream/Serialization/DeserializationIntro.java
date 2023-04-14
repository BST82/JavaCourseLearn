package fileHandling_in_Java.inputStream.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationIntro {

	public static void main(String[] args) {
		
		Employee emp = null;
		try {
			FileInputStream inputStream = new FileInputStream("C:\\users\\Ashu\\Desktop\\file\\SerializedFile.txt");
		    ObjectInputStream objectStream = new ObjectInputStream(inputStream);
		    emp =(Employee)objectStream.readObject();
		    
		    System.out.println("After Deserialization :");
		    System.out.println(emp.empid);
		    System.out.println(emp.empName);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
