package LearningArray;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3};
		int b[]=arr;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		b[1]=34;
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
