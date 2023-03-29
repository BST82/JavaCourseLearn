package com.java.String_Learning;

public class ProgrammOne {

	public static void loC(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			//65 to 90 (A to Z)
			//97 to 122 (a to z)
          char ch=str.charAt(i);
         int data=ch+32;
//          System.out.println((char)data);
         ans+=(char)data;
          
       }
		  System.out.println(ans);
	}
	public static void upC(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			//65 to 90 (A to Z)
			//97 to 122 (a to z)
          char ch=str.charAt(i);
         int data=ch-32;
//          System.out.println((char)data);
         ans+=(char)data;
          
       }
		  System.out.println(ans);
	}
	public static void main(String[] args) {
		String s="JAVA";
		loC(s);
		String s1="java";
        upC(s1);
	}

}
