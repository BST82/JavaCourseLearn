package Decision_Control;

public class Break_And_Continue {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=3;j++) {
				if(j==2) {
					//break;
					continue;
				}
				System.out.println("i="+i+"j="+j);
			}
		}

	}

}
