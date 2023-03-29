package com.Array.Learning;
import java.util.Scanner;
class Student {
	int rollno;
	String name;
	int age;
}
public class Array_Of_Objects_self_Study {

	public static void main(String[] args) {
		Scanner sc2=new Scanner(System.in);
		int n;
		n=sc2.nextInt();
		
		Student arr[]= new Student[n];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Student();
			System.out.println("Enter value for i "+i+" ");
			System.out.println("Enter roll number");
		arr[i].rollno=	Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter name");
		arr[i].name=sc.nextLine();
		
		System.out.println("Enter age");
		arr[i].age=	Integer.parseInt(sc.nextLine());
		}

		Array_Of_Objects_self_Study obj=new Array_Of_Objects_self_Study();
		obj.showing(arr);
	}
	public void showing(Student[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("roll no is:- "+arr[i].rollno);
			System.out.println("name is:- "+arr[i].name);
			System.out.println("age is:- "+arr[i].age);
		}
	}

}
