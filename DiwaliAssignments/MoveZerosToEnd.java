
public class MoveZerosToEnd {
	public static void moveZerosToEnd(int []array) {
		int nonZeroIndex =0;
		for(int i=0; i<array.length; i++) {
			if(array[i] !=0) {
				array[nonZeroIndex++] = array[i];
				
			}
		}
		while(nonZeroIndex <array.length) {
			array[nonZeroIndex++] =0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {0,1,0,3,12};
		moveZerosToEnd(array);
		for(int i:array) {
			System.out.println(i + "");
		}

	}

}
