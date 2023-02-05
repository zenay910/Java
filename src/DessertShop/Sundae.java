package DessertShop;

public class Sundae extends IceCream{
	
	//Attributes
	private String toppingName;
	private double toppingPrice;

	//Constructors
	//default
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.0;
	}

	//full constructor
	public Sundae(String n, int sc, double pps, String tn, double tp) {
		super(n, sc, pps);
		toppingName = tn;
		toppingPrice = tp;
	}

	//Methods
	public String getToppingName() {
		return toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingName(String tn) {//setters are void
		toppingName = tn;
	}

	public void setToppingPrice(double tp) {//setters are void
		toppingPrice = tp;
	}
	
	public double calculateCost() {
		return toppingPrice + super.calculateCost();
	}

	public String toString(){
		String line1 = String.format("%s",getName());
		String line2 = String.format("%d lbs. @ $%f/lbs.:",scoopCount , pricePerScoop);
		String line3 = String.format("$%f",calculateCost());
		String line4 = String.format("[TAX: $%f]",calculateTax());
		String line5 = String.format("%s",getToppingName());
		String line6 = String.format("%f",toppingPrice);

		String output = String.format("%s %s %s %s %s %s",line1,line2,line3,line4,line5,line6);




		return output;
	}
}
