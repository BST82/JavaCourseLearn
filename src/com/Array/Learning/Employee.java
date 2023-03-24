package com.Array.Learning;

//passing object references 

public class Employee {
     
	int id;
	String name;
	
	Employee(int ID, String NAME){
		this.id=ID;
		this.name=NAME;
	}
	
	Employee(Employee obj){
		//this cons take object reference
		this.id=obj.id;
		this.name=obj.name;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee info = new Employee(22,"Amit");
		System.out.println(info.id);
		System.out.println(info.name);
		
		
		Employee info2 = new Employee(info);
		System.out.println(info2.id);
		System.out.println(info2.name);
	}

}
