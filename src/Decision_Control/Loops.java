package Decision_Control;
/*
 * for (minimum execution is 0)
 * while (minimum execution is 0)
 * do while (minimum execution is 1)
 */
public class Loops {
	public static void main(String[] args){
		//for(initialize;condition;update)
		for(int i=1;i<=5;i++){
			System.out.println(i);
		}
		
		//while(condition){}
		
		int j=1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		//do{} while(condition);
		int k=10;
		do {
			System.out.println(k);
		}while(++k<=12); 
		
	}
		
}
