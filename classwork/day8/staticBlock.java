
public class staticBlock {

	
	private int Section;
	private static int srNo;
	
	static {
		System.out.println("------------ within the static block----"+ srNo);
		
	}
	
	static void display() {
		System.out.println("Serial Number" + srNo);
		srNo=1000;
		
		
	}
	staticBlock(){
		System.out.println("------------- within defaults constructor" + srNo);
	    Section++;
	    srNo++;
	}
	
	public String tostring() {
		return "MyClass [Serial No" + srNo + "section" + Section+";
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticBlock o1 = new staticBlock();
		System.out.println(o1);
		staticBlock.display();
		
		staticBlock o2 = new staticBlock();
		System.out.println(o2);
		staticBlock.display();
		staticBlock o3 = new staticBlock();
		System.out.println(o3);
		staticBlock.display();
		
	}

}
