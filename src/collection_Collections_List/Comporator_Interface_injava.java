package collection_Collections_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int id;
	String name;
	
	Student(int i,String n){
		this.id=i;
		this.name=n;
	}
	
//	public String toString() {
//		return this.id+" "+ this.name;
//	}
	
	public String toString() {
		return id+" "+name;
	}
}

class StudentById implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		return student1.id-student2.id;
	}
	
}

class StudentByName implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		return student1.name.compareTo(student2.name);
	}
	
}
public class Comporator_Interface_injava {

	public static void main(String[] args) {
		
		Student s1= new Student(102,"Zijay");
		Student s2= new Student(101,"Rakesh");
		Student s3= new Student(103,"vikram");
		
		List<Student> list =new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
//		System.out.println(list);
//		Collections.sort(list,new StudentById());
//		System.out.println(list);
		
		Collections.sort(list,new StudentByName());
		System.out.println(list);
	}

}
