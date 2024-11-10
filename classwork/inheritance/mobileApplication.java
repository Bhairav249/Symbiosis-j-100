package hasAInheritance;

class myclass {

	private String cardNo;

	public myclass() {
		  System.out.println("Simcard Object Construcred");
		  System.out.println("Simcard obj constructed");
		  cardNo = "new sim card";
	}
	@Override
	public String toString() {
		return "myclass [cardNo=" + cardNo + "]";
	}

}

class Mobile {
	private myclass mysim = new myclass();
	private String mobileName = "OPPO";
	private int modelNo = 121212;

	@Override
	public String toString() {
		return "Mobile [mysim=" + mysim + ", mobileName=" + mobileName + ", modelNo=" + modelNo + "]";
	}
}

public class mobileApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mymobile = new Mobile();
		System.out.println(mymobile);

	}

}
