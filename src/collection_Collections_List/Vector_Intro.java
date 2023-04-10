package collection_Collections_List;

import java.util.Vector;

public class Vector_Intro {

	public static void main(String[] args) {
		
		//vectors are synchronous in nature 
		
		
		Vector<String> v= new Vector<>();
		v.add("Hello");
		v.add("Hi");
		System.out.println(v);
		
		v.add("Hi");
		System.out.println(v);
		
		v.add(2, "bye");
		System.out.println(v);
		
		System.out.println(v.get(3));
	}

}
