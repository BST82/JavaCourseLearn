package multithreding;


class YY{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName() +
					" "+num+" * "+i+" = "+(num*i));
		}
	}
}

class OK extends Thread{
	private YY table;
	private int n;
	OK(YY table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}

class OK2 extends Thread{
	private YY table;
	private int n;
	OK2(YY table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}

class OK3 extends Thread{
	private YY table;
	private int n;
	OK3(YY table,int n){
		this.table = table;
		this.n = n;
	}
	public void run(){
		table.printTable(n);
	}
}

public class SirCode {

	public static void main(String[] args) {
		YY obj = new YY();
		int n1 = 5;
		int n2 = 10;
		OK t1 = new OK(obj,n1);
		OK t2 = new OK(obj,n2);
		t1.start();
		t1.setName("A");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t2.setName("B");
		t2.setPriority(Thread.MIN_PRIORITY);
		try {
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
