import java.util.Scanner;

public class jagged {

	
	public static void JdintArray() {
		Scanner sc = new Scanner(System.in);
        System.out.println("input Array Row");
        
        int n = sc .nextInt();
        int arr[][] = new int[n][];
        for(int i=0; i<n; i++) {
        	System.out.println("Imput number of Elements in + (i +1)+ *row:");
        	arr[i] = new int[sc.nextInt()];
                     	
        }
            int count = 0;
            for(int i=0; i<arr.length; i++) {
            	for(int j=0; j<arr[i].length; j++) {
            	count++;
       }
}
            System.out.println("Input" + count + "array Elements:");
            for(int i=0; i<arr.length; i++) {
            	for(int j=0; j<arr[i].length; j++) {
            		arr[i][j] = sc.nextInt();
            		
            	}
            }
            System.out.println("Array Elements is:");
            for(int i=0; i<arr.length; i++) {
            	for(int j=0; j<arr[i].length; j++) {            	
            	System.out.println(arr[i][j]+"");
            	
            	}
	      }
	}
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		JdintArray();
	}

}
