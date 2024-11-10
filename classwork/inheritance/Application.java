package hasAInheritance;

import java.util.Scanner;

public class Application {
	
	public static Employee createEmp() {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter The Department id");
	     int did=sc.nextInt();
	     
	     System.out.println("Enter The Departemnt name");
	     String deptName=sc.next();
	     
	     System.out.println("Enter The Employee id");
	     int eid=sc.nextInt();
	     
	     System.out.println("Enter the Employee name");
	     String empName=sc.next();
	     
	     Employee e1 = new Employee();
	     
	     Department dept = new Department();
	     
	     dept.setDeptNo(did);
	     dept.setDeptName(deptName);

	     e1.setEmpid(eid);
	     e1.empname(empName);
	     e1.setDept(dept);
	     return e1;
	  
	}
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employee e1=createEmp();
		 System.out.println("Department Details: Department id:"+ e1.getDept().getDeptNo());
		 System.out.println("Employee Details of Employee id:"+ e1.getEmpId() + "Employee name" + e1.empname()
	}

}
