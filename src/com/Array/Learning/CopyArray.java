package com.Array.Learning;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter size of array:- ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		//copy array
		int copy[]=new int[n];
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			int a=sc.nextInt();
			array[i]=a;
		}
		System.out.print("\n" + "original array :- ");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
		System.out.print("\n" + "Copy array :- ");
            for(int i=0;i<array.length;i++) {
			copy[i]=array[i];
			System.out.print(copy[i]+" ");
		}
		
		
	}

}
