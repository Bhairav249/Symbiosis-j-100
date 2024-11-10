
public class Objects
{

	int age;
	String studName;
	
	public Objects()
	
	{
		 age = 31;
		 studName = "Bhairav";
	     System.out.println("Age is"+ age);
	     System.out.println("StudName"+ studName);
	    	
	}
	
	public Objects(int age, String studName)
	
	{
		this.age=age;
		this.studName=studName;
		
	}
	
	public void showdata()
	  {
		  System.out.println("Age is"+ age);
		  System.out.println("StudName"+studName);
	  }
	
	
	public void check_valid()
	{
		if(age>30) {
			System.out.println("this the Eligible for work");
		}
		else {
			System.out.println("This is not Elegible for Work");
		}
	}
	public static void main(String[] args) {
	        Objects obj1 = new Objects();
	        obj1.showdata();
	        obj1.check_valid();
	        
	        
	        System.out.println("");
	        
	       Objects  obj2 = new Objects(20, "kartik");
	        if(obj2.check_valid() == true)
	        {
	        	System.out.println("Hey you are Elegible for the play cricket");
	        	
	        }
	        else {
	        	System.out.println("Hey you Are not elegible for the play cricket")
	        }
	        
	       obj2.showdata();
	       obj2.check_valid();
	        
	       
		// TODO Auto-generated method stub

	}

}
