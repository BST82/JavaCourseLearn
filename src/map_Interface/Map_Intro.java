package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Intro {

	public static void main(String[] args) {
		//Map<key,value>
		Map<Integer,String> map=new HashMap<>();
		map.put(101,"Aryan");
		map.put(102,"Vijay");
		map.put(103,"John");
		
		System.out.println(map);
	}

}
