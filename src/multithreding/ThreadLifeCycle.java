package multithreding;

class Demo extends Thread{
	
	public void run() {  //Running 
		System.out.println("Hello from thread ");
		try {
			Thread.sleep(2000);  //wait
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After sleep ");
	}
}
public class ThreadLifeCycle {

	public static void main(String[] args) {
		Demo d=new Demo();  //new state
		d.start();       // Runnable state
	}

}
