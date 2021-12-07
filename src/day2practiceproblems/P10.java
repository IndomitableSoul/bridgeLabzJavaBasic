//Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c
package day2practiceproblems;
import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        
        System.out.println("Enter the First number: ");
        a = sc.nextFloat();
        System.out.println("Enter the Second number: ");
        b = sc.nextFloat();
        System.out.println("Enter the Third number: ");
        c = sc.nextFloat();

        float first = a+b*c;
        float second = c+a/b;
        float third = a%b+c;
        float fourth = a*b+c;

         System.out.println("Results:-");
         System.out.println("First Operation is : "+first);           
         System.out.println("Second Operation is : "+second);         
         System.out.println("Third Operation is : "+third);          
         System.out.println("fourth Operation is : "+fourth);          

         if(first>second && first>third && first>fourth) {
           System.out.println("Maximum is "+first);
         }
         else if (second>third && second>fourth) {
        	 System.out.println("Maximum is "+second);
		}
         else if (third>fourth) {
        	 System.out.println("Maximum is "+third);
		}
         else {
        	 System.out.println("Maximum is "+fourth);
		}
         if(first<second && first<third && first<fourth) {
             System.out.println("Minimum is "+first);
           }
           else if (second<third && second<fourth) {
          	 System.out.println("Minimum is "+second);
  		}
           else if (third<fourth) {
          	 System.out.println("Minimum is "+third);
  		}
           else {
          	 System.out.println("Minimum is "+fourth);
  		}
        sc.close();
}
}