public class TwoSum {
	public static int []findTwoSum(int[]  array, int targetSum){
	int [] result = new int[2];
	for(int i=0; i<array.length; i++) {
		for(int j=i+1; j<array.length; j++) {
			if(array[i] +array[j] == targetSum) {
				result[0] =i;
				result[1] =j;
				return result;
				
			}
		}
	}
	return null;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,7,11,55};
		int targetSum = 9;
		int[] result  = findTwoSum(array,targetSum);
		if(result !=null) {
			System.out.println("Indexes:" +result[0]+ ""+result[1]);
			
		}
		else {
			System.out.println("No Solution Found");
		}
		
    }
}
	
