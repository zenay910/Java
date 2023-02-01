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


}
