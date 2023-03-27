package LearningArray;

public class DeepCopy {

	
//	in deep array copy element not effect other 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int a[]= {1,2,3,4};
		int b[]=a.clone();
		//int b[]=new int[a.length];
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	System.out.println(++b[0]);
		
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}

}
