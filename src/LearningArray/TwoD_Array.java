package LearningArray;

public class TwoD_Array {

	public static void main(String[] args) {
		//declaring and defining
		//data_type arrName[]={{},{},{}};
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
         
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
