package garbageCollection;

public class Test3 {


	String objname;
	Test3(String name){
		this.objname=name;
	}
	
	protected void finalize() {
		System.out.println(this.objname+" is fit for GC ");
	}
	
	public static void main(String[] args) {
	
		Test3 t1= new Test3("Obj A");
		t1=null;// this is suitable for garbage collection
		Test3 t2= new Test3("Obj ");
		
		System.gc();
	}

}
