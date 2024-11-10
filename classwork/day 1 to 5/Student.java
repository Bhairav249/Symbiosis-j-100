import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
          System.out.println("Enter The username");
          String username=sc.next();
          System.out.println("Enter The Password");
          String password=sc.next();

          if(username.equals("admin") && password.equals("admin"))
          {
        	  System.out.println("True");
          }
          else {
        	  System.out.println("false");
          }
          
	} 
	

}
