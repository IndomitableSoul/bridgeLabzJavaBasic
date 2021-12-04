package workshop1.problem2;

public class Truck extends Car{
	
	int weight;
	
	public Truck(){
		super();
	}
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	double getSalesPrice() {
		int discount = 1;
		double salesPrice = 0;
		if(weight>2000) {
			discount = 10;
			salesPrice = this.regularPrice-(discount*this.regularPrice/100);
		}
		else {
			discount = 20;
			salesPrice = this.regularPrice-(discount*this.regularPrice/100);
		}
		
		return salesPrice;
	}

}
