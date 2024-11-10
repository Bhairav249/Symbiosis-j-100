import java.util.*;

public class Password {
	 
    Scanner sc = new Scanner(System.in);
    String name; //sc.next();
    String pass;  //sc.next();
    
    public Password(String name, String pass)
    {
    	this.name=name;
    	this.pass=pass;
    	
    }
    
    public void accept() {
    	System.out.println("Enter The name");
    	String name = sc.next();
    	System.out.println("Enter your Password");
    	String pass = sc.next();
    }
    
    public void display() {
    	System.out.println("Name is: "+ name);
    	System.out.println("Pass is: "+ pass);
    	
    }
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Password s1 = new Password("kunal" ,"6666");
        s1.accept();
        s1.display();
	}

}
