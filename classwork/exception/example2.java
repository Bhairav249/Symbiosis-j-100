// throws used to a system user defined exception at the time of method call
// 
package exception;

import java.util.Scanner;

class Myexception extends Exception
{
	public Myexception(String a){
	super(a);
}
}

public class example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        try {
        	if(age<0) {
        		
             throw new Myexception("my exception catched");
             
        }
        	
        }
        	catch(Myexception  e) {
        	      System.out.println(e.getMessage());
   
        
        	 }
      	
        }
        
	}


