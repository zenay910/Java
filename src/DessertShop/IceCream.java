package DessertShop;

public class IceCream extends DessertItem {

	//Attributes
	private int scoopCount;
	protected double pricePerScoop;

	//Constructors
	//default
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0.0;
	}

	//full constructor
	public IceCream(String n, int sc, double pps) {
		super(n);
		scoopCount = sc;
		pricePerScoop = pps;
	}

	//Methods
	public double getScoopCount() {
		return scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setScoopCount(int sc) {//setters are void
		scoopCount = sc;
	}

	public void setPricePerScoop(double pps) {//setters are void
		pricePerScoop = pps;
	}
	
	public double calculateCost() {
		return pricePerScoop * scoopCount;
	}


}
