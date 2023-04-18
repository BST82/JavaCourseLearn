package garbageCollection;

public class Test2 {

	
	String objname;
	Test2(String name){
		this.objname=name;
	}
	
	protected void finalize() {
		System.out.println(this.objname+" is fit for GC ");
	}
	
	
	public static void main(String[] args) {
	
		Test2 t1 = new Test2("OBJ A");
		Test2 t2= new Test2("OBJ B");
		t1=t2;
		System.gc();
	}

}
