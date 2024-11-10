public class MatrixSearch {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; i<cols; i++) {
				if(matrix[i][j] ==target) {
					return true;
					
				}
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		int target=9;
		
		if(searchMatrix(matrix,target)) {
			System.out.println("Number Found In matrix");	
		}
		else {
			System.out.println("Nouber not Found In matrix");
			
		}

	}

}
