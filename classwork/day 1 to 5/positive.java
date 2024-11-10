import java.util.Scanner;
public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        if(num<0) {
        	System.out.println(num + "The Number is negative");
        }
        else {
        	System.out.println(num + "The Number is Positive");
        }
	}

}
