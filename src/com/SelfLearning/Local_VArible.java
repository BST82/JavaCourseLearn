package com.SelfLearning;

public class Local_VArible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		/*public int x=30;
		 * private int x=30;
		 * protected int x=30;
		 * static int x=30;
		 * transient int x=30;
		 * volatile int x=30;
		 * 
		 * 
		 * these all are give error 
		 */
		
		
		final int x=30;
		//only final modifier will not give error for local variable
		System.out.println(x);
     
	}

}
