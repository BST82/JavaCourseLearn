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

//POJO : Plane old java obj
class ProductInfo{
	//this is called model 
	//we will save over data using model 
	private int pId;
	private String pName;
	private String pImg;
	
	//setter and getter method
	
	/*
	 * setter method is optional 
	 */
//	ProductInfo(int i,String s1, String s2){
//		this.pId=i;
//		this.pName=s1;
//		this.pImg=s2;
//		
//	}
	
	public void setPid(int id) {
		 this.pId=id;
	}
	public int getPid() {
		return this.pId;
	}
	public void setPName(String name) {
		 this.pName=name;
	}
	public String getPNmae() {
		return this.pName;
	}
	public void setPImg(String img) {
		 this.pImg=img;
	}
	public String getPImg() {
		return this.pImg;
	}
	
	public String toString() {
		return "toString() called  and Product Information "+this.pId+ " name "+this.pName+" img "+this.pImg;
	}
}

public class Introduction_Encapsulation {


	public static void main(String[] args) {
		
//		Product p= new Product();
//		int id=p.getProductId();
//		System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductDesc());
//		System.out.println(id);
	
		
		ProductInfo p1=new ProductInfo();
//		p1.setPid(200);
//		int id=p1.getPid();
//		System.out.println(id);
//		
//		String name=p1.getPNmae();
//		System.out.println(name);
		
		
//		ProductInfo usingConstructor= new ProductInfo(102,"Mobile","img  ");
		System.out.println(p1);
	}

}
