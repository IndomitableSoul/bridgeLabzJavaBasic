package day3practiceproblems;

public class P9 {

	public static void main(String[] args) {
		int[] arr = {23, 45, 21, 34, 12, 145, 95, 32};
	    
	        int temp = 0;    
	               
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	         
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }  
	        System.out.println();
	        System.out.println("Elements of sorted array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }   

	}

}
