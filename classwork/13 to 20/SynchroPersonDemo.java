package day20;

class mytable{
	public synchronized static void testtable() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("\n"+i);
				
			}
			catch(InterruptedException ex) {}
			
		}
	}
}

class thread1 extends Thread{
	@Override
	public void run() {
		mytable.testtable();
		
	}
}

class thread2 extends Thread{
	@Override
	public void run() {
		mytable.testtable();
		
	}
}
public class SynchroPersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1 obj1 = new thread1();
		thread2 obj2 = new thread2();
		obj1.start();
		obj2.start();
		

	}

}
