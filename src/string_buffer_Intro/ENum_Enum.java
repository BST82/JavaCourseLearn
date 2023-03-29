package string_buffer_Intro;
/*
 * variables defind in enum that will 
 * public satatic final in nature 
 * and they will be constant 
 * enum.constant name we can access data;
 * 
 * public static final Monday=new Day() ==>Internally work
 * 
 */
enum Days{
	Monday,
	Tuesday,
	Wednesday,
	Thrusday,
	Friday,
	Saturday,
	Sunday;
}
public class ENum_Enum {

	public static void main(String[] args) {
		
		Days arr[]=Days.values();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		/*
		 * used to show me the 
		 * Index position on the values we 
		 * use ordinals()
		 */

		Days data=Days.Monday;
		System.out.println(data.ordinal());
	}

}
