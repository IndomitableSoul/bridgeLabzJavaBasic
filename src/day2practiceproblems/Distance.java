//Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance 
//from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). 
//Use Math.power function
package day2practiceproblems;




public class Distance
{
	public static void main(String args[]){ 
        long x1,x2,y1,y2;
		double distance;
 
	    x1=Long.parseLong(args[0]);
	    y1=Long.parseLong(args[1]);
		x2=Long.parseLong(args[2]);
	    y2=Long.parseLong(args[3]); 
		     
	    distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
  	    System.out.println("distancebtn"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
	}
}

    