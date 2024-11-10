package day13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortarrrays {
	
	public static void method2() {
		
		static void sort_array() {
			int [] arrray = new int [] {90, 60, 45, 50, 54, 232, -343, 99};
			
			Arrays.sort(array);
			System.out.println("Elements of an arrray sorted in acceding order");
			
			for(int i=0; i<Array.length; i++) {
				System.out.println(array[i]);
				
			}
		
	}
		
		static void array_sortwithoutmethod() {
			int [] arr = new int [] {78, 90, 56, 44,5454,343,778,87,-343, -66};
			System.out.println("Arrray Elements After Sorting");
			
			for(int i=0; i<arr.length;  i++) {
				for(int j=i+1; j<arr.length; j++ ) {
					int tem =0 ;
					if(arr[i] > arr[j])
						tem =arr[i];
				        arr[i]=arr[j];
				        arr[j]= tem;
				        
				}
			}
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
