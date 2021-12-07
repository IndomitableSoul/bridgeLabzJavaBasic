//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
package day2practiceproblems;

public class P3 {
	public static void main(String[] args)   
	{  
	int num = 5, i = 1, sum = 0;  
	//executes until the condition returns true  
	while(i <= num)  
	{  
	//adding the value of i into sum variable  
	sum = sum + i;  
	//increments the value of i by 1  
	i++;  
	}  
	//prints the sum   
	System.out.println("Sum of First 100 Natural Numbers is = " + sum);  
	} 
}
