
public class Jaagedarray {

	public static void Ajag() {
		int myarray [][] = new int [3][];
		myarray[0]= new int[] {1, 2, 3};
		myarray[1]= new int[] { 4, 5};
		myarray[2]= new int[] {6, 7, 8, 9};
		System.out.println(" two d Array");
		for(int i=0; i<myarray.length ;i++) {
			for(int j=0; j<myarray[i].length; j++)
				System.out.println(myarray[i][j] + "");
			System.out.println();
			
		}
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ajag();
        
	}

}
