package day4practiceproblems;

class Encapsulation {
  private int i;
  public void setI(int i) {
	  this.i = i;
  }
  
  public int getI() {
	  return i;
  }
}

public class P3{
	public static void main(String[] args) {
		Encapsulation ob1 = new Encapsulation();
		ob1.setI(10);
		System.out.println(ob1.getI());
	}
}