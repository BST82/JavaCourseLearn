package garbageCollection;

public class Test4 {

	
	String objname;
	Test4(String name){
		this.objname=name;
	}
	
	protected void finalize() {
		System.out.println(this.objname+" is fit for GC ");
	}
	
	
	public static void main(String[] args) {
		
		//anonimous object (object without name)
		
		new Test4("Obj D");
		new Test4("Obj E");
		
		System.gc();
		
	}

}
