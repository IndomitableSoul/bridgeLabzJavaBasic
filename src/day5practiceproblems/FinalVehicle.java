package day5practiceproblems;

public class FinalVehicle {

	  //declaring and initializing a final variable
	  final int speedlimit = 60;
	  void controlSpeed() {
	    //Trying to change the value of the final variable will give an error
	    //speedlimit = 150;
		  System.out.println("speedlimit value is :"+speedlimit);
	  }
	  public static void main(String args[]) {
		  FinalVehicle obj = new FinalVehicle();
		  obj.controlSpeed();
		}
	  }
	