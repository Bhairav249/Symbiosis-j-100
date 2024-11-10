import java.util.Scanner;

public class BankingSystem {
	public String userName;
	public String accno;
	private String password;
	private String Balance;
    Scanner sc = new Scanner(System.in);
    
    public void  OpenAccount(){
    	 System.out.println("Enter your Name");
    	 userName =sc.next();
    	 System.out.println("Enter Account Account Number");
    	 accno = sc.next();
    	 System.out.println("Enter The Password");
    	 password =sc.next();
    	 System.out.println("Check Your balance");
    	 Balance = sc.next();  	 
    }
    
    
    
	public String getpassword() {
		return this.password;
	}
	
	public void setpassword() {
		this.accno=accno;
		this.password=password;
	}
	public void 
	
	public void show() {
		System.out.println("acc"+ accno);
		System.out.println("pass"+password);
		
	}

        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
	}

}
