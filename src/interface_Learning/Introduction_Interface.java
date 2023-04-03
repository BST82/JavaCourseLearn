package interface_Learning;

interface Department{
	
	//public & abstract
	//public abstract void m1() by defalut for every method 
	void m1();
	public static final int a = 0;
	
}
interface Account extends Department{
	
	void m2();
}
class ABC implements Department{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

//One interface does not allow to im[lement another Interface
//interface ABCo implements Department{
//
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

class ABCD implements Account{


	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Introduction_Interface {

	public static void main(String[] args) {
		
		System.out.println(Department.a); //public static
//Department.a=100; // valuse can't change because of final keyword
		
	}

}
