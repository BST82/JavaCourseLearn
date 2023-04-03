package polymorphisum_concepts;

class Shape2{
	
	public void  draw() {
		System.out.println("Shape");
	}
    public void draw2(int a) {
    	System.out.println("With 1 parameter");
	}
}

class Circle extends Shape2{
	@Override
	public void  draw() {
		System.out.println("Circle");
	}
}

class Rectangle extends Shape2{
	@Override
	public void  draw() {
		super.draw();
		System.out.println("Rectangle");
	}
}

public class Run_Time_Polymorphisum {

	public static void main(String[] args){
		
//		Circle c=new Circle();
//          c.draw();
		
		
		//run time polymorphisum 
		//it depends on type of object
		/*parent type reference points to 
		 * child type  object this is called 
		 * Dynamic Dispatch 
		 * 
		 * So we can achieve Run Time Polymorphisum
		*/
//		
//		Shape2 s= new Circle(); //run time
//		s.draw();
		
		Shape2 s1= new Rectangle();  //run time 
		s1.draw();
		
	}

}
