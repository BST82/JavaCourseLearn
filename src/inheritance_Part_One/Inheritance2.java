package inheritance_Part_One;

class Base{
	Base(){
		this(20);
		System.out.println("base class ");
	}
	Base(int a){
		System.out.println("base class with ragu");
	}
}
class Derived extends Base{
	 Derived(){
		 this(10);
		System.out.println("derived class ");
	}
	 Derived(int a){
		 super();
		System.out.println("derived class with ragu");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		Derived obj=new Derived();

	}

}
