package function_learning;

public class Method_Learning {

	//non -static function 
	public void m1() { //(function definition)
		System.out.println("m1() is executed ");
	}
	
	//static function 
	public static void m2() { //(function definition)==defining the function
		System.out.println("m2() is executed ");
	}
	
	public static void main(String[] args) {
		Method_Learning obj=new Method_Learning();
		obj.m1(); //invoking/calling function
		
		//using class name
		Method_Learning.m2();//invoking/calling function

	}

}
