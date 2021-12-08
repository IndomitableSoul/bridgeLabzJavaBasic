package day5practiceproblems;

interface MultipleInterface {
	
	default void show()
    {
        // from interface 1
        System.out.println("Default show method printing interface 1");
    }
}

interface MultipleInterface2 {
	
	default void show()
    {
        // from interface 1
        System.out.println("Default show method printing interface 2");
    }
}

class TestInterface implements MultipleInterface,MultipleInterface2
{
	public void show()
    {
		MultipleInterface.super.show();
		
		MultipleInterface2.super.show();
    }
}
