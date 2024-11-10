import java.util.Scanner;

public class call_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//myclass xy = new myclass();
		myclass xy = new myclass();
		
		myclass.example(5, 6);
		xy.values(xy);
		xy.display();
		
		
	}

}
class myclass{
	int a;
	int b;
   myclass() // default constructor
   {
	    a = 30;
	    b = 40;
	    System.out.println("A=" + a);
	    System.out.println("B" + b);
	    
   }
   
   myclass(int a, int b){
	   this.a=a;
	   this.b=b;
	   
   }
   
   public static void example(int x,int y) // paramiterized constructor
   
   {
	   ++x;
	   x++;	   
	   System.out.println("The value of X:" + x);
	   System.out.println("The value of y:" + y);
   }
   
   public void values(myclass obj) {
	   obj.a+=40;
	   obj.b+=50;
	     
   }
   public void display() {
	   System.out.println("Value of a:" + a);
	   System.out.println("value of b:" + b);
	   
   }
}
