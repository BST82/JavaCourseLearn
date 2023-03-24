package LearningArray;
import java.util.Scanner;

// Arrray is data structure 
public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring and defining array 
		int[] arr= {1,2,3,4,5};
		
		//2 data type nameOfArray[] =new data_type[size];
       int[] number = new int[10];
       
       //Assigning the value index will start with zero
		number[0]=1;
		number[1]=11;
		number[2]=111;
		System.out.println(number[0]);
       
		System.out.println("Enter size of array:- ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int array[]=new int[n];
		for(int i=0;i<array.length;i++) {
			int a=sc.nextInt();
			array[i]=a;
		}
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
		
	}

}
