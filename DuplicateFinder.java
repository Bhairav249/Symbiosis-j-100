
public class DuplicateFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] array = {1, 2,3, 4, 4,3, 4,5 ,6,2,1,5,3,9};
		   System.out.println("Duplicates In The Array Are");
		    

		   for(int i=0; i<array.length; i++){
		      for(int j=0; i<array.length; j++){
		       if(array[i]==array[j]){
		        System.out.println(array[i] + "");
		     }
		   }
		}

	}
}


	