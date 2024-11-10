package day20;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("my book on java ");
		
		BookReader readerA = new BookReader(b1);
		BookReader readerB = new BookReader(b1);
		
		Thread Athread = new Thread(readerA, "Bhairva");
		Thread Bthread = new Thread(readerB, "kartik");
		
		
		Athread.start();
		Bthread.start();
		
		try {
			Thread.sleep(5000);
			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		BookWrite writer  = new BookWrite(b1);
		
		Thread bookWriterthread = new Thread(write);
		b1.notifyAll();
		System.out.println("Notify Reader");
		
	
	}

}
