//Write a Program to find Palindrome Number
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.

package day2practiceproblems;
import java.util.*; 
public class P7 {

   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = sc.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number is not a palindrome.");   
      sc.close();
   }  
}