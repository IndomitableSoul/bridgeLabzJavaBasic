package day4practiceproblems;

public class P2 {
       static int i = 10;
       
       static {
    	   System.out.println("from static block");
    	   System.out.println(i);
    	   System.out.println("static block completed");
       }
       
       public static void main(String[] args) {
    	   System.out.println("main begins");
	       System.out.println(P2.i);
	       System.out.println("main ends");
       }
}
