import java.util.Scanner;
public class sumofarray{

	 public static void sumof() {
		 int [] marks = new int[5];
		 int total =0;
		 Scanner sc = new Scanner(System.in);
		 for(int i=0; i<marks; i++) {
			 System.out.println("Enter The marks");
			 marks[i] =sc.nextInt();
			 total = total+marks[i];
			 
		 }
		 System.out.println(total);
		 
	 }
	 
	 for(int i:marks) {
		 System.out.println(i);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          sumof();
	}

}
