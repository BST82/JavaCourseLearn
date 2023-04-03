package inheritance_Part_One;

 
interface X{
	public  void m1();
}
interface Y{
	public  void m1();
}
class C implements X,Y{
	public  void m1() {
		System.out.println("A");
	}
}
public class Multiple_Inheritance {

	public static void main(String[] args) {
	C c = new C();
	c.m1();

	}

}
