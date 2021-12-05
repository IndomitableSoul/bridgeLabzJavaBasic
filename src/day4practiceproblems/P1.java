package day4practiceproblems;

 class P {
   int i;
   P(){
	   super();
   }
   P(int i){
	   super();
	   this.i = i;
   }
}

public class P1{
	public static void main(String[] args) {
	   P ob1 = new P(10);
	   System.out.println(ob1.i);
	}
}