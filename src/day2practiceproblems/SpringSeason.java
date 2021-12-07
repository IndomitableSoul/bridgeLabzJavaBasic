//Write a program SpringSeason.java that takes two int values m and d from the command line and 
//prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise
package day2practiceproblems;
import java.util.*;
public class SpringSeason{
	    public static void main (String[] args){
	  
	      Scanner scan = new Scanner(System.in);
	      int month;
	      int day;
	    
	      System.out.print("Please enter month and day: ");
	      month = scan.nextInt();
	      day = scan.nextInt();
	      if (month >= 3 && month <=6 && day>= 20) 
	      {
	            System.out.println("The given month and date is correct");
	        } 
	      else {
	            System.out.println("The given month and date is not correct try again..?");
	        }
	      scan.close();
	     } 
	  }