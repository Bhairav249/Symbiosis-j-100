package hasAInheritance;

public class Employee {

	  private int empid;
	  private String empname;
	  private Department dept;
	  public int getEmpId() {
		  return empid;
	  }
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", dept=" + dept + "]";
	}

	public static void mian(String [] args) {
		Employee e1 = new Employee();
		e1.setDept(null);
	}
}

