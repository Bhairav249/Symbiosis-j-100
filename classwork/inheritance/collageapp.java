package hasAInheritance;

class employee() {
	private String empid;
	private String empname;
	
	public employee() {
		System.out.println("This is the Employee");
		empid="this is the id";
		empname="this is the name";
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

class department() {
	private employee myemp = new employee();
	private String empnameName = "bhairav";
	private int empids = 12121;
}		

}

public class collageapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         department mydept = new department();
         System.out.println(mydept);
         
	}

}
