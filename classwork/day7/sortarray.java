
public class sortarray {

	public static void sortarrays() {
		int [] array = new int [] {2, 4, 6, 7, 8, 9, 0};
		System.out.println("before sorting");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i] + "  ");
			
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				//System.out.println("I":  )
				int temp=0;
				if(array[i] >array[j]) {
					temp =array[i];
					array[i]=array[j];
					array[j]=temp;
					
					
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            sortarrays();
            
	}

}
	

