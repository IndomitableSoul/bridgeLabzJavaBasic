package workshop1.problem2;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;
    
    public Ford() {
    	super();
    }
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	double getSalesPrice() {
		double salesPrice = this.regularPrice-(this.manufacturerDiscount*this.regularPrice/100);
		return salesPrice;
	}

}
