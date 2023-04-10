package interfaces;

interface Service{
	void Service();
}
class Services{
	public void Services() {
		System.out.println("Services Implements");
	}
}
class Services1 extends Services{
	public void Services1() {
		System.out.println("Services Implements");
	}
}

public class RunTime_Polymorphisum {

	public static void main(String[] args) {
		Services s= new Services1();
		Services s2= new Services1();
	}

}
