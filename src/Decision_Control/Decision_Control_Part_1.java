package Decision_Control;
import java.util.Scanner;

/*
 * Java’s decisions statements: 

if
if-else
nested-if
if-else-if
switch-case
jump – break, continue, return

 */
/*
 * 1) If else conditional statement
 */
public class Decision_Control_Part_1 {

	public static void  ageVarifier(int age) {
		if(age>18) {
			System.out.println("eligible");
		}else {
			System.out.println("not eligible");
		}
	}
	
	/*
	 * 2) Nested If else conditional statement
	 */	
	
	public static void  loginSystem(String user,Scanner sc) {
		if(user.equalsIgnoreCase("seeta")) {
			System.out.println("Enter password");
			int pass=sc.nextInt();
			  if(pass==123) {
				  System.out.println("welcome");
			  }else {
				  System.out.println("wrong pass");
			  }
		}else {
			System.out.println("get out");
		}
	}
	
	//Switch
	public void switch_One() {
	System.out.println("one");
	}
	public void switch_Two() {
		System.out.println("Two");
	}
	public void switch_Three() {
		System.out.println("Three");
	}
	public static void main(String[] args) {
//		int age=19;
//		ageVarifier(age);
		
//		Scanner sc= new Scanner(System.in);
//		String s=sc.nextLine();
//		int n=sc.nextInt();
//		loginSystem(s,sc);
		
		
		
/*
 *Nested  if elseif() if ------------
 */
		
//		
		int num=90;
		if(num>80) {
			System.out.println("Distinction");
		}else if(num<75 && num>69) {
			System.out.println("First Div");
		}else if(num<69 && num>50){
			System.out.println("Second Div");
		}else if(num<50 && num>40) {
			System.out.println("Third Div");
		}else {
			System.out.println("Fail");
		}
		
	}
	
	/*Switch 
	 * group of function for 
	 * targetting one perticular function
	 * 
	 */
	
	int choice=1;
	Decision_Control_Part_1 obj=new Decision_Control_Part_1();
	switch(choice) {
	case 1:obj.switch_One();
	
	break;
	case 2:obj.switch_Two();
	break;
	case 3:obj.switch_One();
	break;
	
	default;
	}
}
}
