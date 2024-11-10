import java.util.Scanner;

public class person {

	int age;
	String name;
	
	public person(int age, String name) {
		this.age=age;
		this.name=name;
		
	}
	
	public void show() {
		System.out.println("Enter The age is" + age);
		System.out.println("Enter The name"+ name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         person [] batch = new person[5];
          int age; String name;
          Scanner sc = new Scanner(System.in);
          for(int i=0; i<batch.length; i++) {
        	  System.out.println("Enter your age");
        	  age =sc.nextInt();
        	  System.out.println("Enter Your name");
        	  name = sc.next();
        	  batch[i] = new person(age,name);
          }
          
          for(int i=0; i<5; i++) {
        	  batch[i].show();
        	  
          }
          
	}

}
