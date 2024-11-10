package day10;

public class Student {

	int rollno;
	String name;
	
	public Student() {}
	public Student(int a) {}
	public Student(int a ,int b) {}
	public Student (String a,String b) {}
	
	public void register() {
		System.out.println("No Args Methods");
		
	}
	
	public void register(int rollno) {
		this.rollno=rollno;
		System.out.println("Only two Regisetr with roll no");
	}
	
	public void register(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
		System.out.println("Register with rollno as name");
		
	}
	
	public void register(String name, int rollno) {
		this.rollno=rollno;
		this.name=name;
		System.out.println("The Regisetr with rollno as along with parmiter");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Student s1 = new Student();
	        s1.register();
	        s1.register(2);
	        s1.register(2,"bhairav");
	        s1.register("yash", 34);
	        
	        
	        
	}
}

