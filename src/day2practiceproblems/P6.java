//Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package day2practiceproblems;

public class P6 {
 
public static void main(String[] args)   
{  
int number = 231, rev = 0;  
//we have not mentioned the initialization part of the for loop  
for(;number !=0;)   
{  
int remainder = number % 10;  
rev = rev * 10 + remainder;
number=number/10;
}  
System.out.println("The reverse of the given number is: " + rev);  
}  
}