import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter The number");
         int num = sc.nextInt();
         System.out.println("Multiplacation of the given number is");
         
		for(int i=1; i<=10; i++) {
			System.out.println(num + "x" + i +  "=" + num*i);		
			
			
			
		}
	}

}
