package day13;

import java.util.Scanner;
import java.util.Arrays;


public class SortArray {

	public static void Bubblesort(int [] arr, boolean ascending) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i; j++) {
				if((ascending && arr[i] > arr[j+1]) || (!ascending && arr[j] < arr[j+1])){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
						
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Number of the arrray");
            int n = sc.nextInt();
            int[] array = new int [n];
            
            System.out.println("Enter The Elements of and array");
            for(int i=0; i<n; i++) {
            	array[i] = sc.nextInt();
            	
            	
            }
            
            System.out.println("Enter The Accding or decding order the arrray");
            String order =sc.next().trim().toLowerCase();
            
            boolean asceding = order.equals("Asc");
            
            Bubblesort(array ,asceding);
            
            System.out.println("Sorted array: "+ Arrays.toString(array));
            
         
	}

}
