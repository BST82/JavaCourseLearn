package Constructor_Learning;

 class A{
	 A(){
		 System.out.println("Hello Class A ");
	 }
 }
 class B extends A{
	 B(){
		 this(10);
		 System.out.println("Hello Class B");
	 }
	 B(int a){
		 super();
		 System.out.println("Hello Class B with arguent");
	 }
 }
public class Constructor_Chaining_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B obj1= new B();
	}

}
