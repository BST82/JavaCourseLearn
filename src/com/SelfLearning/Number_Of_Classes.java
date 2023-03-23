package com.SelfLearning;

//atmost one public class present inside a same program 
public class Number_Of_Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 A obj=new  A ();
		 obj.main(args);
		 
		 B obj2=new  B ();
		 obj2.main(args);
		 
		 C obj3=new  C ();
		 obj3.main(args);

	}
	

}
class A{
	public static void main(String[] args) { System.out.println("hello A");}
}
class B{
	public static void main(String[] args) { System.out.println("hello B");}
}

class C{
	public static void main(String[] args) { System.out.println("hello C");}
}
// it will give error 
//public class D{
//	
//}


