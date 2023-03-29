package com.java.String_Learning;

public class StringMethods {

	public static void main(String[] args) {
		//charAt();
		String s1="java";
		char ch=s1.charAt(1);
		char ch2=(char)((char)ch+32); 
//		System.out.println(ch2);
//		System.out.println(ch);
		
		//compareTo
		//return the difference of unicode value
		
		String s3="java";
		char ch3='j';//74-106=-106+74=-32
		int data=ch3;
//		System.out.println(data);
//		System.out.println(s1.compareTo(s3));
		
		
		String s4="java";
		String s5="jbva";
//		System.out.println(s4.compareTo(s5));
//		System.out.println(s4.compareTo("java"));
		
		//concat(); or +
		String name="bhagyashri ";
		String surname="Tamrakar";
//		System.out.println(name.concat(surname));
//		System.out.println(name+surname);
		
		
		/*//contains();
		 * this will check text is present in 
		 * perticular string or not
		 * 
		 */
		String text="We are learning java";
//		System.out.println(text.contains("o"));
		
		/*endsWith();
		 * chack the last string
		 * and return boolean value
		 */
//		System.out.println(text.endsWith("java"));
	
		/*
		 * equals():check content of string
		 *==
		 *most important
		 *
		 *==:-check memory location
		 */
	
		String data1="Hello";
		String data2="Hello";
//		System.out.println(data1.equals(data2));
//		System.out.println(data1==(data2));
		
		String data4=new String("Hello");
		String data5=new String("Hello");
//		System.out.println(data4.equals(data5));
//		System.out.println(data4==(data5));
//		System.out.println("Hello".equalsIgnoreCase("hello"));
	
	
	//tolowercase();
		String data6="BHAGYASHRI";
//		System.out.println(data5.toLowerCase());
	
		
		//toUppercase();
				String data7="bhagyashri";
//				System.out.println(data7.toUpperCase());
	
				//toCharArray()
				String data8="java";
				char[] arr=data8.toCharArray();
				for(int i=0;i<arr.length;i++) {
//					System.out.println(arr[i]);
				}
	
	/*
	 * split()
	 */
				//reverse string programm
//				String data9="we are learning java";
//				String [] arr2=(data9.split(" "));
//				
//				for(int i=0;i<arr2.length;i++) {
//					
//					StringBuilder s2=new StringBuilder(arr2[i]);
//							s2.reverse();
//				
				
//					System.out.println(s2);
//				}
				
				
				//indexOf();
				
	}

}
