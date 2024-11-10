
public class MaxMinFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5,2,34,3,-51,6,4};
		
		int max = array[0];
		int min = array[0];
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max =array[i];
				maxIndex = i;
			}
			if(array[i]<min) {
				min =array[i];
				minIndex = i;
			}
		}
		
		System.out.println("Maximum Elements:" + max + "at index" + maxIndex);
		System.out.println("Minimum Elements:" + min+ "at index" + minIndex);
		
	}

}
