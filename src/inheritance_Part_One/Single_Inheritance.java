package inheritance_Part_One;

class Vehicle{
	int numOfWheels=2;
//	Vehicle(){
//		System.out.println("Vehicle class");
//	}
	public void m1() {
		System.out.println("parent m1");
	}
}

class FourWheeler extends Vehicle{
	int numOfWheels=4;
//	FourWheeler(){
//		super();
//		System.out.println("FourWheeler class");
//	}
	public void m1() {
		System.out.println("child m1");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		
		FourWheeler car=new FourWheeler();
//		System.out.println(car.numOfWheels);
		car.m1();
		Vehicle car2=new Vehicle();
//		System.out.println(car2.numOfWheels);
		car2.m1();
		
		
		//variables depends on type of reference
		//methid depends on type object
	}

}
