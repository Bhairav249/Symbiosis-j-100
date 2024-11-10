import java.util.Scanner;

public class Array{

	public static void sd_example() {
		

		int myarray [] = new int [5]; // declataring the array with size 
		
		int [] bhairav = new int [] {1,2,3,4,5}; // desclarating the array with initilize value
		bhairav[0]=1;bhairav[1]=10;bhairav[2]=5;
		bhairav[3]=4;bhairav[4]=5;
		for(int i=0;i<bhairav.length; i++) {
			System.out.println(bhairav[i]);
			
			
		}
		
	}
	
	public static void acceptSD() {
		int sum=0;
		int [] pincode = new int [5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
		System.out.println("Enter The value for Array");
		pincode[i]=sc.nextInt();
        sum +=pincode[i];
     }
         	for(int i =0; i<pincode.length;i++) {	
			System.out.println(pincode[i]);
			System.out.println(sum);
			
		}
	}
    
	      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sd_example();
		acceptSD();
      
	}
	

}

