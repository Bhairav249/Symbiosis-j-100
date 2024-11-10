package day20;

class reseve extends Thread{
	int no=2;
	int want;
	
	public reserve(int want) {
		super();
		this.want=want;
		
	}
	@Override
	public void run() {
		bookTicket();
		
	}
	private void bookTicket() {
		String tname = Thread.currentThread().getName();
		System.out.println("no of seates avaibale"+ no);
		synchronized(this) {
			if(no>=want) {
				System.out.println("trying to book"+ want+ "seates avaiable" +no);
				try {
					Thread.sleep(2000);
					
				}
				catch(InterruptedException e) {
					e.printStackTrace();
					
				}
				no=no-want;
				System.out.println(want + "seate book for " + tname);
				
			}
			else {System.out.println("Seates  no avaibale"); }
		}
	}
}

public class Reservatationsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reserve res = new reserve(1);
        Thread  t1= new Thread(res);
        Thread t2  =new Thread(res);
        Thread t3 = new Thread(res);
        
        t1.setName(" passanger -1");
        t2.setName("passanger -2");
        t3.setName("passanger -3");
        
        t1.start();
        t2.start();
        t3.start();
        
	}

}
