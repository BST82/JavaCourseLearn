package multithreding;

class Table{
    int a;
    Table(int n){
    	this.a=n;
    }
	public void printT(int a) {
		for(int i=1;i<=10;i++) {
			int x= a*i;
			System.out.println(Thread.currentThread().getName());
			System.out.println(x);
		}
	}
}
//class Table1 implements Runnable{
//	int n=3;
//	public void run() {
//		printTable(this.n);
//	}
//	public void printTable(int a) {
//		for(int i=1;i<=10;i++) {
//			int x= a*i;
//			System.out.println(x);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}
class Thread1 extends Thread{
	private Table table; // reference of Table class
	Thread1(Table t){
		this.table=t;
	}
	public void run() {
		table.printT(5);
	}
}
class Thread2 extends Thread{
	private Table table; // reference of Table class
	Thread2(Table t){
		this.table=t;
	}
	public void run() {
		table.printT(5);
	}
}
public class ClassWork {

	public static void main(String[] args) {
		
		Table t1= new Table(5);
		Thread1 t= new Thread1(t1);
		t.start();
		Thread t2= new Thread();

		
	}

}
