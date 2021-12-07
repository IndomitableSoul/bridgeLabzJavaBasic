package day2practiceproblems;
import java.util.*;
public class P1 {
	

	    public static void main(String[] args) {

	    Scanner scan=new Scanner(System.in);  
	    System.out.print("Enter the Digit Number: ");
	    
	    int x = scan.nextInt();
	    if (x == 0) {
	        System.out.println("Zero");
	    }
	    else if(x == 1){
	     System.out.println("One");
	    }
	    else if(x == 2){
	        System.out.println("Two");
	    }
	    else if(x == 3){
	        System.out.println("Three");
	    }
	    else if(x == 4){
	        System.out.println("Four");
	    }
	    else if(x == 5){
	        System.out.println("Five");
	    }
	    else if(x == 6){
	        System.out.println("Six");
	    }
	    else if(x == 7){
	        System.out.println("Seven");
	    }
	    else if(x == 8){
	        System.out.println("Eight");
	    }
	    else if(x == 9){
	        System.out.println("Nine");
	    }
	    else{
	        System.out.println("You entered Invalid input please try again");
	    } 
	    scan.close();
	    }
	
}
