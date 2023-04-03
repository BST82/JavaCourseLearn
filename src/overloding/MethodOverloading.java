package overloding;

public class MethodOverloading {
public void mm1() {
	System.out.println("mm1() without args");
}
//public String mm1() {
//	System.out.println("mm1() without args");
//return "hello";
//}
public void mm1(int a,float b) {
	System.out.println("mm1() with int args");
}
public void mm1(float b,int a) {
	System.out.println("mm1() with int args");
}
public void mm1(String b) {
	System.out.println("mm1() with String args");
}
	public MethodOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.mm1();

	}

}
