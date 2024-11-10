import java.util.*;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String or characters");
        String str = sc.next();
        
        if(str.equals("a") && str.equals("e") && str.equals("i") && str.equals("o") && str.equals("u"))
        {
        	System.out.println("Yes");
        }
        	
        else {
        	System.out.println("no");
        }
        	
	}

}
