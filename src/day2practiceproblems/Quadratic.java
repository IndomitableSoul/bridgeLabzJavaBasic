//Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)
//Take a, b, and c as input values to find the roots of x.
package day2practiceproblems;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter the value of A: ");
        Double a =scan.nextDouble();

        System.out.println("Enter the value of B: ");
        Double b =scan.nextDouble();

        System.out.println("Enter the value of C: ");
        Double c =scan.nextDouble();

        Double root; 
        Double root1;
        Double Discriminate= b*b-4*a*c;
        System.out.println("Roots are Discriminate: "+Discriminate);

        if(Discriminate<0) 
        {
            System.out.println("Roots value imaginary");
            root=0.0;
            root1=0.0;
            System.out.println("Root : "+ root);
            System.out.println("Root1 : "+ root1);
        }

        else if(Discriminate==0) {
        	System.out.println("Roots are equal.");
            root = -b /(2*a);
            root1 = -b /(2*a);
            System.out.println("Root : "+ root);
            System.out.println("Root1 : "+ root1);
        }

        else if (Discriminate>0) {
        	System.out.println("Roots are not equal.");
            root = (-b + Math.sqrt(Discriminate))/(2*a);
            root1 = (-b - Math.sqrt(Discriminate))/(2*a);
            System.out.println("Root : "+ root);
            System.out.println("Root1 : "+ root1);
        }
        scan.close();
    }
}