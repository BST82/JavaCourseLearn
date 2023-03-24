package com.Array.Learning;


class Car{
	Car(){
		System.out.println("No-args");
	}
	Car(int a){
		this();
		System.out.println("Para");
	}
	Car(String a,int b){
		this();
		System.out.println("string ,int");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car(10);
		
	}

}
