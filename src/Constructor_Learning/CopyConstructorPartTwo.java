package Constructor_Learning;

public class CopyConstructorPartTwo {

	int a;
	String b;
	CopyConstructorPartTwo (int val,String name){
		this.a=val;
		this.b=name;
	}
	CopyConstructorPartTwo(CopyConstructorPartTwo  ref){
		a=ref.a;
		b=ref.b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyConstructorPartTwo obj = new CopyConstructorPartTwo(10,"munmun");
//		System.out.println(obj.a);
//		System.out.println(obj.b);
		CopyConstructorPartTwo obj2 = new CopyConstructorPartTwo(obj);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
	}

}
