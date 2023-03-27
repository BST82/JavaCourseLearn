package LearningArray;
import java.util.Scanner;


public class TwoDArrayInput {

	public static void main(String[] args) {
		
		
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter size of Rwo and Column");
	   int r=sc.nextInt();
	   int c=sc.nextInt();
	   
	   System.out.println("Enter elements");
	   int arr[][]=new int[r][c];
	   
	   for(int i=0;i<r;i++) {
		   for(int j=0;j<c;j++) {
			   arr[i][j]=sc.nextInt();
		   }
	   }
	   
	   System.out.println("Your matrix :- ");
	   for(int i=0;i<r;i++) {
		   for(int j=0;j<c;j++) {
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }
	
	   System.out.println("Change elements:-");
	   
	 for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr[0].length;j++) {
			   
//			   if(arr[0][1]!=0) {
//				   arr[0][1]=0;
//			   }
//			   if(arr[1][0]!=0) {
//				   arr[1][0]=0;
//			   }
//			   if(arr[1][2]!=0) {
//				   arr[1][2]=0;
//			   }
//			   if(arr[2][1]!=0) {
//				   arr[2][1]=0;
//			   }
			   if((arr[i][j])%2==0) {
				   arr[i][j]=0;
		         }
			   
			   
		   System.out.print(arr[i][j]+" ");
	   }
		   System.out.println();
	}
	 
	 

}
}
