package com.SelfLearning;

public class Instance_Variable {

	//we can't acces directly from static area
	//we can access using object reference 
	int x=10;
	int num;
	String str;
	double dub;
	boolean bol;
	
	
	public void my() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Instance_Variable obj = new Instance_Variable();
		obj.my();
//		System.out.println(x); // it will give error
	
		System.out.println(obj.num);
		System.out.println(obj.str);
		System.out.println(obj.dub);
		System.out.println(obj.bol);
	
	}

}
