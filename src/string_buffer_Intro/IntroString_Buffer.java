package string_buffer_Intro;

/*
 * StringBuffer is Also a class
 */
public class IntroString_Buffer {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb2= new StringBuffer(20);
		System.out.println(sb2.capacity());

		//capacity == num,ber of characters stores at a time 
		StringBuffer sb3= new StringBuffer("J2EE");
		System.out.println(sb3);
		
	/*
	 * StringBuffer is mutable we can change and update it 
	 */
		
		StringBuffer sb4=new StringBuffer("java");
		System.out.println(sb4);
		sb4.append(" Learning");
		System.out.println(sb4);
		
		//insert();
		
		sb4.insert(4," hello");
		System.out.println(sb4);
		
		//reverse method
		sb4.reverse();
		System.out.println(sb4);
		
		String str= "We are learning StringBuffer";
		StringBuffer sb5=new StringBuffer(str);
		sb5.reverse();
		System.out.println(sb5);
		
		//delete();
		StringBuffer sb6=new StringBuffer("Wikipedia");
		sb6.delete(1, 4);
		System.out.println(sb6);
		
		
	}

}
