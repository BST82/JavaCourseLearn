package Decision_Control;
import java.util.Scanner;
public class Switch_Work {

	public void withdraw() {
		System.out.println("You can widrow");
	}
	public void balance() {
		System.out.println("You can check balance");
	}
	public static void deposit() {
		System.out.println("You can deposite");
	}
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("1.widraw");
		System.out.println("2.Balance");
		System.out.println("3.Deposit");
		
		System.out.println("Choose AnyOne");
		int a=sc.nextInt();
		
		Switch_Work obj=new Switch_Work();
		
			switch(a){
			case 1:obj.withdraw();
			break;
			case 2:obj.balance();
			break;
			case 3:deposit();
			break;
			default:
				System.out.println("Wrong Input");
			}

		
				
	}

}
