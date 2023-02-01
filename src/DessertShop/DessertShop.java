package DessertShop;

//import java.util.*;

public class DessertShop {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		Candy c1 = new Candy("Candy Corn", 1.5, .25);
		order1.add(c1);
		
		Candy c2 = new Candy("Gummy Bears", .25, .35);
		order1.add(c2);
		
		Cookie co1 = new Cookie("Chocolate Chip", 6, 3.99);
		order1.add(co1);
		
		IceCream ic1 = new IceCream("Pistachio", 2, .79);
		order1.add(ic1);
		
		Sundae s1 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
		order1.add(s1);
		
		Cookie co2 = new Cookie("Oatmeal Raisin", 2, 3.45);
		order1.add(co2);
		
		
		for(DessertItem o : order1.getOrderList()) {
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", o.getName(), o.calculateCost(), o.calculateTax());
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", order1.orderCost(), order1.orderTax());
		
		double orderTotal = order1.orderCost() + order1.orderTax();
		
		System.out.printf("%-25s$%-8.2f\n", "Order Total: ", orderTotal);
		
		System.out.println("Total items in the order: " + order1.itemCount());
		
		
	}
}
	
	