package day5practiceproblems;

interface intfA {
	
	void empname();
	}
interface intfB
{
	void empaddress();
}

interface intfC extends intfA,intfB
{
	void emprole();
}

class Sample1 implements intfC
{
	public void empname()
	{
		System.out.println("Smith");
	}
	
	public void empaddress()
	{
		System.out.println("Banglore");
	}
	
	public void emprole()
	{
		System.out.println("software engineer");
	}
}
