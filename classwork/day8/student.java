import java.util.Scanner;

public class student {
	
	  int id;
	  String Name;
	  
	  public student(int id, String Name) {
		  this.id=id;
		  this.Name=Name;
	  }
	  
	  public void show() {
		  System.out.println("id"+id);
		  System.out.println("Name"+Name);
		  
	  }
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student batch[] = new student[5];
        int id; String Name;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<batch.length; i++) {
			System.out.println("Enter your id");
			id= sc.nextInt();
			System.out.println("Enter your name");
			Name=sc.next();
			batch[i]=new student(id,Name);
				
		}
		
		for(int i=0; i<5; i++) {
			batch[i].show();
		}
           
	}

}
