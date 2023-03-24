package Constructor_Learning;

public class CopyConstructor {
  
	int a;
	String b;
	
	CopyConstructor(){
		a=10;
		b="Bhagyashri";
		System.out.println(a+" "+b);
	}
	CopyConstructor(CopyConstructor ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyConstructor obj= new CopyConstructor();
		CopyConstructor obj2=new CopyConstructor(obj);
	}

}
