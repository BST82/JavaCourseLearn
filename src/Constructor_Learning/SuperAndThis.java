package Constructor_Learning;

class Parent {
	String s="bhagyashri";
}
class Child extends Parent{
	String s="munmun";
	
	Child obj= new Child();
	
	
}
public class  SuperAndThis{

	SuperAndThis (int  d){
		super();
		System.out.println("hello");
		
	}
	SuperAndThis (float a){
		this();
		System.out.println("hello2");
	}
	public SuperAndThis() {
		System.out.println("hello3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SuperAndThis ss= new SuperAndThis(1.8f);
		
	
	
	}

}


