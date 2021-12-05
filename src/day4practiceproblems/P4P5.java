package day4practiceproblems;


class Vehicle {
	 String color;
	 double mileage;
	 Vehicle()
	 {
		
	 }
	 
	 Vehicle(String color, double mileage)
	 {
		 this.color = color;
		 this.mileage = mileage;
	 }
	 
	 void move() //Overridden method
	 {
		 System.out.println("Vehicle is moving");
	 }
	 
	 void move(String loc) //method overloading
	 {
		 System.out.println("Vehicle is moving towards "+loc);
	 }
}
class Car extends Vehicle {

	String  type;

	Car() 
		{
			
		}
		
		Car (String color, double mileage, String type)
		{
			super(color,mileage);
			this.type = type;
		}
		
		void move()//Overriding method 
		{
			System.out.println(type+ " car is moving");
		}

}


class City extends Car{

	 City() 
	{
		
	}
	 City(String color, double mileage, String type)
	 {
		 super(color,mileage,type);
	 }
	 
	 void move(String loc)
	 {
		 System.out.println(type+ "Car is moving towards " +loc);
	 }

}

public class P4P5 
{

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[5];
		v[0] = new Vehicle("Red", 55.5);
		v[1] = new Car("Black", 25.5, "luxury"); //upcasting
		v[2] = new  City("White", 35.5, "sedan");//upcasting
		v[3] = new City("Grey", 20.0, "economy");//upcasting
		v[4] = new Vehicle("Pink",75.0);
		
		for(int i = 0 ; i<v.length ; i++)
		{
			System.out.println("color is = " +v[i].color );
			System.out.println(" mileage is = " + v[i].mileage);
			if(v[i] instanceof Car)
			System.out.println("type is =" +((Car) v[i]).type);//downcasting

			v[i].move();
			v[i].move("Coorg");
			System.out.println("++++++++++++++");
		}
		

	}

}
