package day1practiceproblems;

public class P4 {

		public static void main(String a[]) {
		int sum = 0;
		int invalid = 0;
		for (int I = 0; I < a.length; I++) {
		try {
		sum += Integer.parseInt(a[I]);
		} catch (NumberFormatException e) {
		invalid++;
		}
		}
		
		System.out.println("Invalid inputs: "+ invalid);
		System.out.println("sum:"+ sum);
		}
		}


