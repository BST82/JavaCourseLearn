package garbageCollection;

class Demo{
	
}
public class GarbageCollectorInJava {

//	public static void show() {
//		Demo d = new Demo();
//	}
	
	String objname;
	GarbageCollectorInJava(String name){
		this.objname=name;
	}
	public static void show() {
		GarbageCollectorInJava ob= new GarbageCollectorInJava("tmp1");
	     display();
	}
	public static void display() {
		GarbageCollectorInJava ob2= new GarbageCollectorInJava("tmp2");
	}
	
	protected void finalize() {
		System.out.println(this.objname+" GC call");
	}
	public static void main(String[] args) {
		
		GarbageCollectorInJava.show();
		System.gc();
	}

}
