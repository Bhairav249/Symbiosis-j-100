package day10;
import java.util.Scanner;
public class travling {
	
	int TA;
	int HRA;
	int DA;
	int PF=2000;
	int basic;
	
	public void calculate() {
		
		System.out.println("provident fund"+ PF);
		
	}
	
	public void calculate(int TA, int basic) {
		this.TA=TA;
		this.basic=basic;
		float netpay = TA+basic-PF;
		System.out.println("Netpayis"+netpay);
	}
    
	public void calculate(int TA, int HRA, int PF) {
		this.TA=TA;
		this.HRA=HRA;
		float netpays = TA+HRA-PF;
		System.out.println("payments"+ netpays);
	}
	
	public void calculate(int TA, int HRA, int DA, int basic int PF) {
		this.TA=TA;
		this.HRA=HRA;
		this.DA=DA;
		int basic=basic;
		double netpay = TA+HRA+DA+basic-PF;
		System.out.println("payments"+ netpay);
		
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        travling t1 = new travling();
        t1.calculate();
        t1.calculate(3000, 1000);
        t1.calculate(4000, 2000);
        t1.calculate(5000, 3000);
        
        
        
	}

}
