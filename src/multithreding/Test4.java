package multithreding;


//can we call start method more than  
// one time on the same thread
class NewThread extends Thread{
	
	public void run() {
		System.out.println("Run method execute");
	}
	public void run(int a) {
		System.out.println("Parameterised Run method execute");
	}
public void start(int a) {
		System.out.println("start hello");
	}
}
public class Test4 {

	
	public static void main(String[] args) {
		
		NewThread t1= new NewThread();
		t1.start(20);
		t1.run(20);
		
	}

}
