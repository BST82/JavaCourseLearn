package multithreding;

class ChildThread  implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread using runnable interface");
	}
	
}

public class Create_Thread_Using_Runnable_Interface {

	public static void main(String[] args) {
		
		ChildThread c= new ChildThread();
		Thread t= new Thread(c);
		t.start();
	}

}
