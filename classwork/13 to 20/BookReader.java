package day20;



public class BookReader  implements Runnable{

	Book b1;
	
	public BookReader(Book b1) {
		super();
		this.b1=b1;
		
	}
	
	@Override
	public void run() {
		synchronized(b1) {
			System.out.println("writer writes a book"+b1.getTitle());
			
			try {
				Thread.sleep(1000);
				
			}
			catch (InterruptedException  e) {
				e.printStackTrace();
				
			}
			b1.setIscomplet(true);
			System.out.println("Book Completed");
			b1.notify();
			System.out.println("Notify Reader");
			
		}
	}

}
