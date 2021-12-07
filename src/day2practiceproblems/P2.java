package day2practiceproblems;
import java.util.Scanner;
public class P2 {
	
	    public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        int n1, n2, n3, n4, n5;
	        System.out.println("Enter the number: ");
	        n1 = scan.nextInt();   
	        if (n1<=0 || n1>=10000) {
	            System.out.println("You entered Invalid number try again ");
	        } 
	        else {
	            n2 = n1%10;      //here printing the unit value 
	            n3 = n1%100/10; //here printing the tens value
	            n4 = n1%1000/100; //here printing the hundreds value
	            n5 = n1%10000/1000; //here printing the thousand value
	            System.out.println("The Number in Units place is : "+ n2);
	            System.out.println("The Number in Tens place is : "+ n3);
	            System.out.println("The Number in Hundreds place is : "+ n4);
	            System.out.println("The Number in Thousand place is : "+ n5);   
	        }
	        scan.close();
	    }
}
