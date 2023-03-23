package com.javalearning.Constructor;

public class Test3 {

	Test3(){
		System.out.println("No agrument constructor");
		
	}
	
	Test3(int id){
		System.out.println("parameterised constructor");
	}
	
	public static void main(String[] args) {
		Test3 t= new Test3(10);
	}
}
