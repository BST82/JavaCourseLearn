package com.java.String_Learning;

public class StringIntro {

	//String is immutable(not changeable)
	public static void main(String[] args) {
		String str="java ";
//		System.out.println(str);
		str.concat("language");//not allowed update in string is not allowed  
//		System.out.println(str); 
		str=str.concat("language");//but reassignment is allow in string 
//		System.out.println(str);
		str="world";
//		System.out.println(str);
//		
		String s1="hello";
		String s2=s1;
		s1="world";
		s2=s1;
		System.out.println(s2);
		
	}

}
