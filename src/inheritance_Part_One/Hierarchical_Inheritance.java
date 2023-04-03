package inheritance_Part_One;
class One {

}

class Two extends One {
 int a=10;
 Two(int i){
	 System.out.println(this.a);
 }
}

class Three extends One {
int b=30;
Three(int i){
	 System.out.println(this.b);
}
}
//class Four extends Three {
//int b=30;
//}

public class Hierarchical_Inheritance {

	public Hierarchical_Inheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
       Two obj=new Three(3);
       
	}

}
