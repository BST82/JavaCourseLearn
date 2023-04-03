package inheritance_Part_One;

class M {
	   public void show() {
	      System.out.println("Hello A");
	   }
	}
	class N extends M {
	   public void show2() {
	      System.out.println("Hello B");
	   }
	}
	class K extends N {
	   public void show3() {
	      System.out.println("Hello C");
	   }
	}
public class MultiLevel_Inheritance {

	public MultiLevel_Inheritance() {
		
	}

	public static void main(String[] args) {
		 K c = new K();
	      c.show();
	      c.show2();
	      c.show3();

	}

}
