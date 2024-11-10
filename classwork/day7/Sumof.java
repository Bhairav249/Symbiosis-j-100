
import java.util.Scanner;

public class Sumof{

	public static void sd_example() {
		
        int sum=0;
		int myarray [] = new int [5]; // declataring the array with size 
		
		int [] bhairav = new int [] {1,2,3,4,5}; // desclarating the array with initilize value
		bhairav[0]=1;bhairav[1]=10;bhairav[2]=5;
		bhairav[3]=4;bhairav[4]=10;
		System.out.println("Enter The value for Array");
		for(int i=0;i<bhairav.length; i++) {
			System.out.println(bhairav[i]);
			sum+=bhairav[i];			
			
		}	
		
		System.out.println("The Sum of array is" + sum);
		
		 
	}
	
	public static void acceptSD() {
		
		int [] pincode = new int [5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		pincode[i]=sc.nextInt();
		
        
     }
         	for(int i =0; i<pincode.length;i++) {	
			System.out.println(pincode[i]);
		
	   }
         	
         
	}
    
	      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sd_example();
		acceptSD();
		sumofarray();
      
	}
	

}

