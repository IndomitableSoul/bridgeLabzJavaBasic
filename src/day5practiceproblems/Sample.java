package day5practiceproblems;

public interface Sample {
	
	void demomethod1();
	void demomethod2();
	void demomethod3();
}

class InterfaceExample implements Sample
{
	@Override
	public void demomethod1()
	{
		System.out.println("This is demo method 1");
	}
	@Override
	public void demomethod2()
	{
		System.out.println("This is demo method 2");
	}
	@Override
	public void demomethod3()
	{
		System.out.println("This is demo method 3");
	}

}