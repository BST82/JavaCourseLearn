package LearningArray;
import java.util.Scanner;

public class ProgrammOne {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void printEvenArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
			}
			
		}
	}
	public static void sumOfD(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.print(sum);
	}
	public static void mynest(int[] arr) {
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			
		}
		System.out.print(sum);
	}
	public static void searchElement(int[] arr,int x) {
	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("Index of element "+i);
			}
			
				
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter size of Array:- ");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
 
		int[] arr=new int[size];
		System.out.println("Enter array elements:- ");
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();
			arr[i]=a;
         //arr[i]=sc.nextInt();
		}
//		System.out.println("Even number:- ");
//		printEvenArray(arr);
//		sumOfD(arr);
//		 mynest(arr);
		
		int x=sc.nextInt();
		searchElement(arr,x);
	}

}
