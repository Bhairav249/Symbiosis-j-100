
public class Emp {
	
	int Employeeid;
	String EmployeeName;
	
	
	public Emp(int Employeeid, String EmployeeName) {
	
        this.Employeeid=Employeeid;
        this.EmployeeName=EmployeeName;
	}
	
	public void show() {
		System.out.println("Employeeid"+ Employeeid);
		System.out.println("EmployeeName" + EmployeeName);
		
	}
        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp batch[] = new Emp[2];
       batch[0] =new Emp(12, "Bhairav");
       batch[1] = new Emp(13, "Yash");
       batch[0].show();
       batch[1].show();
       
	}

}
