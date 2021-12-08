package day5practiceproblems;

interface InterfaceFields {

	public static int num=10;
	public void display();
}

class Fields implements InterfaceFields
{
	public static int num=100;
	public void display()
	{
		System.out.println("this is the Display method");
	}
	
	public void show()
	{
		System.out.println("this is the Show method");
	}
}	
