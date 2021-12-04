package workshop1.problem2;

public class Sedan extends Car{
	int length;

	public Sedan() {
		super();
	}
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	double getSalesPrice() {
		int discount = 1;
		double salesPrice = 0;
		if(length>20) {
			discount = 5;
			salesPrice = this.regularPrice-(discount*this.regularPrice/100);
		}
		else {
			discount = 10;
			salesPrice = this.regularPrice-(discount*this.regularPrice/100);
		}
		
		return salesPrice;
	}
	

}
