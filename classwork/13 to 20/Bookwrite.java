package day20;

public class Bookwrite implements Runnable {

	Book b1;

	public Bookwrite(Book b1) {
		super();
		this.b1 = b1;
	}

	@Override
	
	public void run() {
		synchronized (b1){
			System.out.println("writer writes book "+ b1.getTitle());
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e ) {
				e.printStackTrace();
				
			}
			BookWriter writer  = new BookWriter(b1);
			Thread bookWriter = new Thread(writer);
			bookWriterthread.start();
			
		}
	}
	
}
