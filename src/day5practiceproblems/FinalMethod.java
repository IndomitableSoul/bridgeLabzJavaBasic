package day5practiceproblems;

public class FinalMethod {

	final void demo()
	{
		int  eyes = 2;
		int legs = 2;
		int ears = 2;
		System.out.println("General Demo of an Animal are: ");
		System.out.println("eyes :" +eyes);
		System.out.println("legs :" +legs);
		System.out.println("ears :" +ears);
	}
}
 
class Dog extends FinalMethod
{
	final void sound()
	{
		System.out.println();
	    System.out.println("the Dog Sound: Bhow Bhow");
	}
}