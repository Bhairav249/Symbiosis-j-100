import java.util.Scanner;


public class arrays {
	
	public static void forstring() {
	      String[] cities = {"pune", "mumbai","goa","nashik","hydrabad"};
	      for(String x: cities) {
	    	  System.out.println(x+ "");
	    	  
	      }
	}
	
	public static void stringArray() {
		String[] sw= {"a","e","i","o","u"};
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<sw.length; i++) {
			System.out.println("Enter The data");
			sw[i] = sc.next();
			
		}
		for(String s:sw) {
			System.out.println(s);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           forstring();
           stringArray();
           
	}

}

