package LearningArray;

public class ObjectPassing {
  
	int a=5;
	void abc(ObjectPassing val) {
		val.a++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ObjectPassing obj = new ObjectPassing();
		System.out.print(obj.a);
		
		
	}

}
