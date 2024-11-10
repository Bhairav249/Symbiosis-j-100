
public class Employee {

	 public String empname;
	 public int empid;
	 public int empage;
	 public int dateofbirth;
	 
	public Employee(String empname, int empid, int empage, int dateofbirth) {
	           this.empname=empname;
	           this.empid=empid;
	           this.empage=empage;
	           this.dateofbirth=dateofbirth;
	             
	}
	public void show() {
		System.out.println("empname"+ empname);
		System.out.println("Empid" + empid);
		System.out.println("empage"+ empage);
		System.out.println("dateofbirth"+dateofbirth);
	}		
	
	class manager extends Employee
	{
		float salary;
		
		public manager(String empname, int empid, int empage, int dateofbirth, float salary) {
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
          
	}

}
