package CoreJava;

public class SecondC {

	int instanceCounter=0;
	static int staticCounter=0;
	static {
		System.out.println("Static block executed");
		
	}
	{
		System.out.println("Instance block is executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondC c1  = new SecondC();
		SecondC c2  = new SecondC();
		SecondC c3  = new SecondC();
		
		System.out.println();
	}

}
