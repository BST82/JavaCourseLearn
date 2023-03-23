package com.javalearning.Constructor;

public class UnderStandThisKeyword {
   
	
	//This keyword
	/*
	 * This keyword referse to the object 
	 * this keyword comes with instance variable
	 */
	//diferentiate between local and instance variable
	//constructor chaining 
	
	
	
	int productId;
	String productName;
	String productDesc;
	
//	UnderStandThisKeyword (int id,String name,String desc){
//    productId=id;
//    productName=name;
//    productDesc=desc;
//    	
//	}
	
	UnderStandThisKeyword (/*this paraneter are local to constructor*/int productId,String productName,String  productDesc){
//	    this.productId=productId;
//	    this.productName=productName;
//	    productDesc= productDesc;
	    
	    /* it will return defaulyt 
	     * value of every datatype
	     *  because construvtor will 
	     *  confuse what are you trying
	     *   to do
	     *   
	     *   We need to tell which is local variable 
	     *   instance variable
	    */
		
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This value of 'this' and 'obj' will same :- ");
		UnderStandThisKeyword obj= new UnderStandThisKeyword(101,"Earphone","OnePlus");
//       
//				System.out.println(obj.productId);
//		System.out.println(obj.productName);
//		System.out.println(obj.productDesc);
		

		System.out.println(obj);
		
		
		
		UnderStandThisKeyword obj2= new UnderStandThisKeyword(101,"Earphone","OnePlus");
		System.out.println(obj2);
	}

}
