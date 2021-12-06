//8. Java Program to print the duplicate elements of an array
package day3practiceproblems;

import java.util.Iterator;

public class P8 {

	public static void main(String[] args) {
		int[] arr = {23, 45, 22, 34, 22, 45, 45, 34};
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1; 
			for (int k = i-1; k >= 0; k--) {
				if(arr[i]==arr[k]) {
					count++; 
				}   
			}
			if(count==1) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			}
			else
				System.out.println(arr[i]+" is dupli");
		}

	}
}