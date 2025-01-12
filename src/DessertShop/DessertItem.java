package DessertShop;

public abstract class DessertItem {
	//Attributes
	private String name;
	private double taxPercent = 7.25;
	
	
	//Constructors
	//default
	public DessertItem() {
		name = "";
	}
	
	//full
	public DessertItem(String n) {
		name = n;
	}
	
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String n) {//setters are void
		name = n;
	}
	
	public double getTaxPercent() {
		return taxPercent;
	}
	
	public void setTaxPercent(double tp) {
		taxPercent = tp;
	}
	
	protected abstract double calculateCost();
	
	public double calculateTax() {
		return taxPercent* calculateCost() /100;
	}

}
