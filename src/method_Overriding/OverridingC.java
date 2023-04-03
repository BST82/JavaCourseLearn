package method_Overriding;

class Vehicle{
	public void speed() {
		System.out.println("Average speed : 120km/hr");
	}
}

class Car extends Vehicle{
	
	@Override
	public void speed() {
		System.out.println("Average speed : 150km/hr");
	}
}

class Child{
	@Override // Anotation 
	public String toString() {
		return "toString is overrided";
	}
}

public class OverridingC {

	public OverridingC() {
		
	}
	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println(ch.toString());
		
		Car cc= new Car();
		cc.speed();
	}

}
