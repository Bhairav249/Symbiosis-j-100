package polymorsums;

public class myAdd {

	public static void add(double a[]) {
		double total=0;
		int len=a.length;
		for(int i=0; i<a.length; i++) {}
		for(double d:a) {
			total =total+d;
			System.out.println(total);
		}
		
	}
	public static void add(int ...a) {
		int sum =0;
		for(int i:a) {
			sum=sum+1;
			
		}
		System.out.println(sum);
		
	}
	
	public void add(double c, int ... a) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double arr [] = {1, 4, 6};
        add(arr);
        
        add(1, 3, 5, 7, 9);
        add(2,6);
        add(1,2,4,5,6,7,8,9);
        
	}

}
ublic static void add(double a[]) {
	double total=0;
	int len=a.length;
	for(int i=0; i<a.length; i++) {}
	for(double d:a) {
		total =total+d;
		System.out.println(total);
