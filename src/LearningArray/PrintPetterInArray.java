package LearningArray;
import java.util.Scanner;

public class PrintPetterInArray {

	public static void main(String args[]){
        
	       System.out.print("Enter 2D array size : ");
	       Scanner sc=new Scanner(System.in);
	       int rows=sc.nextInt();
	       int cols=rows;
	        
	        
	       int twoD[][]=new int[rows][cols];
	        
	          
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<cols;j++)
	            {
	                twoD[i][j]=1;
	                if(rows%2==0) {
	                	if(i-j==(rows)/2||i+j==(rows)/2-1||j-i==(rows)/2||i+j==3*(rows)/2-1.) {
	                    	twoD[i][j]=0;	
	                    }
	                }
	                else if(i-j==(rows-1)/2||i+j==(rows-1)/2||j-i==(rows-1)/2||i+j==3*(rows-1)/2) {
	                	twoD[i][j]=0;	
	                }
	            }
	         }
	        System.out.println("The Array is");
	        for(int []x:twoD){
	            for(int y:x){
	            System.out.print(y+" ");
	            }
	            System.out.println();
	        }
	        
	    }  
	//diamond in even or odd array

}
