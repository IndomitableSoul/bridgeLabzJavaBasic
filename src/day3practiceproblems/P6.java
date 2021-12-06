//Java Program to print the elements of an array in reverse order

package day3practiceproblems;

import java.util.Iterator;

public class P6 {

	public static void main(String[] args) {
		int[] arr = {23, 45, 22, 34};
		//array elements printing in reverse
		 for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
