package pakJDBC;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StatementInterfaceDemo.showeEmp();
		System.out.println("............................ ");
		System.out.println(StatementInterfaceDemo.updateEmpName(5, "bhairav"));
		StatementInterfaceDemo.updateEmpSalary(5, 65000);
		System.out.println("............... Adter updating name and Salary ............");
		StatementInterfaceDemo.showeEmp();
		StatementInterfaceDemo.DeleteEmp(5);
		StatementInterfaceDemo.deleteEmp(100);
		StatementInterfaceDemo.deleteEmp(120);
		System.out.println("............After Deleting......");
	    
		
		
		

	}

}
