package day1practiceproblems;

public class P6 {
	static int i=10;
	static {
		System.out.println("static block");
	}
	static void m1() {
		System.out.println(i);
		System.out.println("in static method");
	}
	public static void main(String[] args) {
		System.out.println(P6.i);
		P6.m1();
	}

}
