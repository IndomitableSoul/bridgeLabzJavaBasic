package workshop1.problem2;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan(120, 100, "while", 10);
		
		Ford ford1 = new Ford(100, 200, "red", 2000, 10);
		Ford ford2 = new Ford(180, 100, "black", 2001, 5);
		
		Car car = new Car(180, 500, "yellow");
		
		System.out.println(sedan.getSalesPrice());
		System.out.println(ford1.getSalesPrice());
		System.out.println(ford2.getSalesPrice());
		System.out.println(car.getSalesPrice());
		
		

	}

}
