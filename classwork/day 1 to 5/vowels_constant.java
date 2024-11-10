import java.util.Scanner;


public class vowels_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    char alpha = sc.next().charAt(0);
    
    if(alpha == 'a' || alpha == 'e' || alpha =='i' || alpha == 'o' || alpha =='u')
    {
    	System.out.println("vowels is preseented ");
    }
    else {
    	System.out.println("vowels is not presented");
    }
    
	}

}
