package collection_Collections_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Employee{
	int id;
	String name;
	
	Employee(int i,String n){
		this.id=i;
		this.name=n;
	}
	
	public String toString() {
		return id+" "+name;
	}
	
}
public class List_Intro2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(121,"arjun");
		Employee e2 = new Employee(111,"Varun");
		Employee e3 = new Employee(115,"Anupma");
		
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		List<Employee> list2=new ArrayList<>();
		list2.add(new Employee(100,"Ankit"));
		list2.add(new Employee(105,"RAj"));
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);
		
		//addd index based on index
		List<Employee> list3=new ArrayList<>();
		list3.add(new Employee(131,"Apurva"));
		list.addAll(2, list3);
		System.out.println(list);
		
		//check empty or not;
		System.out.println(list.isEmpty());
		
		//get index value;
		System.out.println(list.get(3));
		
		
		//Iterator method 
		Iterator<Employee> itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//remove value
		System.out.println(list.remove(e2));
		System.out.println(list);
		
		//
		System.out.println(list.indexOf(e3));
		
		///filter based on A
		System.out.println(list);
		
//		 Stream<String> s = Stream.of(
//		            "arjun", "aman", "pooja", "arti");
//		  s.filter(str -> str.startsWith("a"))
//          .forEach(System.out::println);
		
		
		
		
		for(Employee e:list) {
			if(e.name.startsWith("A")) {
				System.out.println(e);
			}
		}
		
		
	}

}
