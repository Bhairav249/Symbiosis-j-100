package day12;

public class Example1 {

	
	 public static void m1() {
		 int a,b,c;
		 a=10; b=10;
		 try {
			 c=a/b;
			 System.out.println("c"+c);
		 }
		 catch(Exception e) {
			 System.out.println("trying a devide a no by 0");
		 }
		 finally {
			 System.out.println("finallay Excuted");
			 
		 }
		 c=a+b;
		 System.out.println("c" +c);
		 
	 }
	 public static void mian(String [] args) {
		 m1();
		 
	 }
}
