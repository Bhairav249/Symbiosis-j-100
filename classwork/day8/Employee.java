
public class Employee {
        
	  int Empid;
	  String EmpName;
	  
	  public Employee(int Empid, String EmpName) {
		  
		  this.Empid=Empid;
		  this.EmpName=EmpName;
		  
	  }
	  
	  public void show() {
		  System.out.println("Empid"+  Empid);
		  System.out.println("Empname"+  EmpName);
		  
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Employee[] batch = new Employee[2];
		batch[0] =new Employee(11, " sham ");
		batch[1]= new Employee(12, " bhairav ");
		batch[0].show();
		batch[1].show();
	}

}
