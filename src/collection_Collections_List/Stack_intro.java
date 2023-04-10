package collection_Collections_List;

import java.util.Stack;

public class Stack_intro {

	public static void main(String[] args) {
		
		Stack<String> s= new Stack<>();
		s.push("B");
		s.push("A");   
		
		System.out.println(s);
		System.out.println(s.pop());
		s.push("C");   
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
		
		
		s.push("java");  //5
		s.push("python");   //4
		s.push("RuyOnRails");  //3
		s.push("javascript");   //2
		s.push("Angular");   //1
		
		System.out.println(s.search("python") +" from down to up 4th position");
		System.out.println(s.search("javascript"));
		System.out.println(s.firstElement());
		System.out.println(s.elementAt(2));
	}

}
