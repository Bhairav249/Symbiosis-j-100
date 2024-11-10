import java.util.Scanner;

public class positive_negative {
        public void isPostive()
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter The Number");
        	int num = sc.nextInt();
        	
        if(num < 0) {
        	System.out.println(num + " the Number is negetive\n");
        }
        else {
        	System.out.println(num + "the number is positive\n");
        }
        }
      
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		positive_negative bhairav = new positive_negative();
		bhairav.isPostive();
		
	}

}
