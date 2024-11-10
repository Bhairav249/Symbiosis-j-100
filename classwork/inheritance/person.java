package hasAInheritance;

public class person {

	private String name;
	 
	public String getName() {
		return name;	
	}
	
	public void setName(String name) {
		this.name = name;
	
	class passport{
		private int passportNo;		
	}
	public int getPassportNo() {
		return passportNo;
		
	}
	public void setPassportNo(int passportNo) {
		this.passportNo=passportNo;
	}
	
	public class OneToOne{
		public static void main(String [] args) {
			person p1 = new person();
			p1.setname("yash");
			
			person p2 = new person();
			p2.setname("kartk");
			
			passport  pp1 = new passport();
			pp1.setPassportNo(11121212);
			
			passport  pp2 = new passport();
			pp2.setPassportNo(11121212);
			
			
		}
	}
}
