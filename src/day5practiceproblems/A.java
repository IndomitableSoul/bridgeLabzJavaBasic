package day5practiceproblems;


//Interface using Abstract Class.
interface A {
	
	void a();
	void b();
	void c();
	void d();
}

abstract class Inter implements A 
{
	public void d()
	{
		System.out.println("I am d method");
	}
}

class Extend extends Inter
{
	public void a()
	{
		System.out.println("I am a method");	
	}
	
	public void b()
	{
		System.out.println("I am b method");	
	}
	
	public void c()
	{
		System.out.println("I am c");	
	}
	
}
