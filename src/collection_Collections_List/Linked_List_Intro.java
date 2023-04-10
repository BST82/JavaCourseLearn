package collection_Collections_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List_Intro {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		list.addFirst(0);
		list.addLast(33);
		System.out.println(list);
		
		
		List<Integer> list2=new ArrayList<>();
		list2.add(24);
		list2.add(12);
		
		list2.addAll(list);
		System.out.println(list2);
		
		
		list.addAll(list2);
		System.out.println(list);
		
		//getFiorst getLast
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
	}

}
