package DessertShop;

import java.util.*;

public class Order {
	//Attributes
	private ArrayList<DessertItem> order;
	
	//Constructors
	public Order() {
		order = new ArrayList<DessertItem>();
	}
	
	//Methods
	public ArrayList<DessertItem> getOrderList() {
		return order;
	}
	
	public void add(DessertItem di) {
		order.add(di);
	}
	
	public int itemCount() {
		return order.size();
	}
	
	public double orderCost() {
		double totalCost = 0;
		for(DessertItem o : order) {
			totalCost += o.calculateCost();
		}
		return totalCost;
	}
	
	public double orderTax() {
		double totalTax = 0;
		for(DessertItem o : order) {
			totalTax += o.calculateTax();
		}
		return totalTax;
	}
	public String toString(){
		String finalOutput = "";
		for (DessertItem e : order) {
			finalOutput += e.toString() + "\n";
			
		}



		return finalOutput;
	}

}
