package com.SelfLearning;

public class Ststic_VAriables {

	static int variable1=22;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(variable1);
Ststic_VAriables obj=new Ststic_VAriables();
obj.main2();
	}

	public void main2() {
		//we can access variables directly from both instance of static area
		System.out.println(variable1);
	}
}
