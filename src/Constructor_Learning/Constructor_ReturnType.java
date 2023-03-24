package Constructor_Learning;

public class Constructor_ReturnType {

	 Constructor_ReturnType(){
		
		//return type is not applicable for constructor
//if we give return type to the c onstructor it will treat as method
		
		System.out.println("constructor");
	}
	void Constructor_ReturnType() {
		System.out.println("I am method not constructor");
		//not going to executed because it is not constructor
		//when we call expilicitly using object than it will call
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_ReturnType obj = new Constructor_ReturnType();
		obj.Constructor_ReturnType();
		
	}

}
