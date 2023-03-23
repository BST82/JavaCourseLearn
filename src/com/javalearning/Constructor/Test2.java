package com.javalearning.Constructor;

public class Test2 {
     int stuId;
     String stuName;
     
     //constructor name is same as class name
 
	Test2(int sid,String sName){
		this.stuId=sid;
		this.stuName=sName;
		//argument constructor 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test2 obj = new Test2(101,"Bhagyashri");
		System.out.println(obj.stuId+" "+ obj.stuName);
	}

}
