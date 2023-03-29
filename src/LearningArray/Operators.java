package LearningArray;

public class Operators {

	public static void main(String[] args) {
		//Airthmetic
		//unary
		//Assignment
		//relational
		//logical
		//bitwise
		//ternary 
		//shif
		
		//operand== a, b any variable
		//operator == '+','-' etc
		
		//unary operator 
		int c=10;
		int d=c++;
		//d=c;
		//c=c+1
//		System.out.println(c+" "+d);
		int e=10;
		int f=++e;
		//f=e
		//e=e+1;
//		System.out.println(e+" "+f);

		
		
		//Relational operator (return type will be boolean)
		int num1=20;
		int num2=30;
		
//		System.out.println(num1<num2);
//		System.out.println(num1>num2);
//		System.out.println(num1==num2);
//		System.out.println(num1!=num2);
//		System.out.println(num1>=num2);
		
		//Logical 
		
		//combine multiple conditions 
		
		int num3=10;
		int num4=40;
//		System.out.println(num3>num4 && num3==num4);
//		System.out.println(num3<num4 || num3==num4);
//		System.out.println(!(!(num3<num4) && (num3>num4)));

		
		
		//Bitwise operator 
		/*
		 * bitwise always work with binary number 
		 * if you will give decimal number 
		 * it will convert decimal to binary number
		 */
		
		int s=10; //1010
		int t=20; //10100
//		System.out.println(s & t);
//		System.out.println(s | t);

		// xor will give 1 with opposite and 0 with same
//		System.out.println(s ^ t);
		
		//shift operator 
		/*
		 * left shit=value*2;<===>(value*2^bit)
		 * right shift = value/2<===>(value/2^bit);
		 */
		int q=20;
		q<<=2;
//		System.out.println(q);
		
		int r=30;
	
//		System.out.println(r>>1);
		
		///Assignment operator 
		//compound statement sum+=19;
		
		int sum=10;
		sum+=20;
//		System.out.println(sum);
		
		//ternary operator 
		int h=10;
		int p=20;
		boolean res=(h>p)?true:false;
		System.out.println(res);
		
		
		
	}

}
