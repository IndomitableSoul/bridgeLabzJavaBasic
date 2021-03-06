package day5practiceproblems;

interface Vehicle {
    
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bike implements Vehicle {
    
    int speed;
    int gear;
      
    // to change gear
    @Override
    public void changeGear(int newGear){
          
        gear = newGear;
    }
      
    // to increase speed
    @Override
    public void speedUp(int increment){
          
        speed = speed + increment;
    }
      
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
          
        speed = speed - decrement;
    }
      
    public void printStates() {
         System.out.println("speed: " + speed
             + " gear: " + gear);
    }
    public static void main(String args[])
	{
		Bike b1 = new Bike();
		b1.changeGear(2);
		b1.speedUp(5);
		b1.applyBrakes(2);
	    System.out.println("Bicycle present state :");
		b1.printStates();
		Bike bike = new Bike();
		bike.changeGear(4);
		bike.speedUp(6);
		bike.applyBrakes(3);
		System.out.println("Bike present state :");
		bike.printStates();
		
	}
}
