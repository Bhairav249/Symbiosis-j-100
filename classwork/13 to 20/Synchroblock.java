package interThreadComn;

class MyClassSynchroized{
	private static int count =0;
     public void add(int value) {
    	 synchronized(this) {
    		 this.count +=value;
    		 System.out.println("\n"+count);
    		 
    	 }
     }
}


public class Synchroblock extends Thread {
	MyClassSynchroized obj = new MyClassSynchroized();
	public void run() {
		obj.add(10);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Synchroblock obj1 = new Synchroblock();
		Synchroblock obj2 = new Synchroblock();
		
		obj1.start();
		obj2.start();
		

	}

}
