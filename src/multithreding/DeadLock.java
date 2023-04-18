package multithreding;

class Resource{
	String resource1="r1";
	String resource2="r2";
	
	Thread t1= new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("T1 starts........");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(resource2) {
				System.out.println("T1 acquire the lock of resource 2");
			}
		}
	});
	Thread t2= new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("T2 starts........");
			synchronized(resource1) {
				System.out.println("T1 acquire the lock 1");
			}
		}
	});
	
}
public class DeadLock {

	public static void main(String[] args) {
		
		
	}

}
