package day5practiceproblems;

public class CallByValue {
	
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100; 
	 }  
	     
	 public static void main(String args[])
	 {  
		 CallByValue val=new CallByValue();  
	  
	   System.out.println("before change "+val.data);  
	   val.change(500);  
	   System.out.println("after change "+val.data);  
	  
	 }  
	}