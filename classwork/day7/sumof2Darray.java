
public class sumof2Darray {

	public  static void array() {
		 int sum =0;
		 int nums[][] = new int [3][5];
		 for(int i=0; i<3; i++)
			 for(int j=0; j<5; j++)
				 nums[i][j] = (1 + i) *(1+ j);
		 System.out.println("print 2 D Array of");
		 for(int i=0; i<3; i++) {
			 for(int j=0; j<5; j++) {
				 System.out.print(nums[i][j] + "   ");
				 
			 }
		 System.out.println("");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        array();
	}

}
