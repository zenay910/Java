package DessertShop;

public class Candy extends DessertItem{
	
	//Attributes
	private double candyWeight;
	private double pricePerPound;
	
	//Constructors
	//default
	public Candy() {
		super();
		candyWeight = 0.0;
		pricePerPound = 0.0;
	}
	
	//full constructor
	public Candy(String n, double cw, double ppp) {
		super(n);
		candyWeight = cw;
		pricePerPound = ppp;
	}
	
	//Methods
	public double getCandyWeight() {
		return candyWeight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}
	
	public void setCandyWeight(double cw) {//setters are void
		candyWeight = cw;
	}
	
	public void setPricePerPound(double ppp) {//setters are void
		pricePerPound = ppp;
	}
	
	public double calculateCost() {
		return candyWeight*pricePerPound;
	}

}
