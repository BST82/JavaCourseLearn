package encapsulation_Concepts;

class Product{
	private int pId=101;
	private String pName="Headphone";
	private String pDes="Nice Product";
	
	public int getProductId() {
		return this.pId;
	}
	public String getProductName() {
		return this.pName;
	}
	public String getProductDesc() {
		return this.pDes;
	}
	
}

class ProductInfo{
	private int pId;
	private String pName;
	private String pImg;
	
	//setter and getter method
	
	public int getProductId() {
		return this.pId;
	}
	public String getProductName() {
		return this.pName;
	}
	public String getProductDesc() {
		return this.pDes;
	}
	
}

public class Introduction_Encapsulation {


	public static void main(String[] args) {
		
//		Product p= new Product();
//		int id=p.getProductId();
//		System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductDesc());
//		System.out.println(id);
	}

}
