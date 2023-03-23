package com.javalearning.Constructor;

import java.util.Scanner;

/*This is multiline code
 * 23/03/2023
 * Taking input from user
 * and giving output acording her
 * what she enter 
 * using constructor
 * 
  System.out.println(emp.empId);
 */


/**
 *  this is document comment
 * @author BST82
 *
 */

public class Emp {
    
	int empId;
	String empName;
	
	Emp(int id,String name2){
		this.empId=id;
		this.empName=name2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
	     //System.in for taking input from user keyboard
		
		 System.out.println("Enter the employee id :- ");
		 int id=sc.nextInt();
		 
		 System.out.println("Enter the employee Name");
		 String name=sc.next();
		 
		 
		 Emp emp = new Emp(id,name);
		 System.out.println(emp.empId);
		 System.out.println(emp.empName);
	
	
	}

}
