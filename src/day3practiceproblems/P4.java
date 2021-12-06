//4) Java Program to print the smallest element in an array
package day3practiceproblems;

public class P4 {

	public static void main(String[] args) {
		int[] arr = {4423, 415, 22, 34, 22, 1235, 4715};
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);

	}

}
