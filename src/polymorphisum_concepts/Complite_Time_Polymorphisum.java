package polymorphisum_concepts;

class Shape{
	
	public static void draw() {
		System.out.println("Without parameter");
	}
    public void draw(int a) {
    	System.out.println("With 1 parameter");
	}
}

public class Complite_Time_Polymorphisum {
	                                        // |
	public static void main(String[] args) {// |
		// TODO Auto-generated method stub  // |
		                                    // |
//		Shape s=new Shape();                // |
//		s.draw();    // compile time polimorphisum        
	
	
	Shape.draw();
	
	}

}
