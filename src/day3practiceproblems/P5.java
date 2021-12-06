//Java Program to print the elements of an array present on an even position
package day3practiceproblems;

public class P5 {

	public static void main(String[] args) {
		int[] arr = {23, 45, 22, 34};
		
		 for (int i = 0; i < arr.length; i++) {
			 if(i%2==0)
			System.out.println(arr[i]);
		}

	}

}
