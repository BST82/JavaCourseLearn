package LearningArray;

class Employee{
	int empId;
	String empName;
	
	 Employee(int id,String name){
		 this.empId=id;
		 this.empName=name;
	 }

	public void printt(Employee[] emps) {
		for(int j=0;j<emps.length;j++) {
			if((emps[j].empId)%2==0) {
				System.out.println(emps[j].empName);
				
			}
	   
			   }
	}
	
	
}
public class Array_Of_Objects {
	
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"A");
		Employee e2=new Employee(102,"B");
		Employee e3=new Employee(103,"C");
		Employee e4=new Employee(104,"D");


		Employee emps[]= {e1,e2,e3,e4};
		emps[0].printt(emps);
	}
	
}

