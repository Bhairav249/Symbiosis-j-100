package interThreadComn;

class OddEvenClass{
	boolean Flag=false;
	
	public synchronized void printOddNumber(int Number) 
	throws InterruptedException{
		while(Flag) {
			wait();
			
		}
		Flag = true;
		Thread.currentThread().setName("Odd Thread:");
		System.out.println(Thread.currentThread().getName() + "" +number);
		notify();
		
	}
	
	
}
public class Odd extends Thread {
	
	int MaxOddNumber;
	OddEvenClass odd;
	Odd(int number, OddEvenClass odd){
		this.MaxOddNumber = number;
		this.odd = odd;
		
		
	}
	
	public void run() {
		int minOddNum  = 1;
		try {
			while(minOddNum <= MaxOddNumber) {
				odd.printOddNumber(minOddNum);
				mumOddNum = mumOddNum +2;
				
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	
	class Even extends Thread{
		int maxEvenNumber;
		OddEvenClass even;
		
		Even(int number, OddEvenClass even){
			this.maxEvenNumber = number;
			this.even=even;
			
		}
		public void run() {
			int minEven = 2;
			try {
				while(minEvenNum <= maxEvenNumber) {
					even.printEvenNumber(minEvenNum);
					minEvenNum = minEvenNum + 2;
					
				}
			}
				catch(InterruptedException e) {
			          e.printStackTrace();
			          
				}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
