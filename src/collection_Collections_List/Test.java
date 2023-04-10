package collection_Collections_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class InfoEmp implements Comparable<InfoEmp>{
	String name;
	int salary;
	
	InfoEmp(String n,int sal){
		this.name=n;
		this.salary=sal;
	}
	
	public String toString() {
		return name+" "+salary;
	}

	@Override
	public int compareTo(InfoEmp o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;  //Acceding 
		
//		return o.salary-this.salary;   //descending
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		
		InfoEmp e1= new InfoEmp("A",1000);
		InfoEmp e2= new InfoEmp("B",3000);
		InfoEmp e3= new InfoEmp("C",2000);
		
		List<InfoEmp> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
