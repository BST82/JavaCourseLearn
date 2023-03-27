package LearningArray;

public class ShallowCopy {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		
	System.out.println("\n");
	++b[0];
	for(int i=0;i<a.length;i++) {
		System.out.print(b[i]+" ");
	}

	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}

}
