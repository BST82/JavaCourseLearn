package multithreding;

class Custom implements Runnable{
	
	public void run() {
		System.out.println("Hello");
	}
}
public class Test3 {

	public static void main(String[] args) {
	 
		
		Custom c1= new Custom();
		Custom c2= new Custom();
		
		Thread t1= new Thread(c1);
		Thread t2= new Thread(c2);
		
		t1.start();
		t2.start();
	}

}
