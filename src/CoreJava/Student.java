package CoreJava;

public class Student {
   int  StuId =101;
   static String StuName="BSt";
   String StuCollege="RECollege";
	public static void main(String[] args) {
	 Student stu = new Student();
	 Student stu2 = new Student();
	 System.out.println(stu.StuId);
	 System.out.println(Student.StuName);
	 System.out.println(stu.StuCollege);
	 
	}
}
