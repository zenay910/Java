package DessertShop;

public class DessertShop {
	public static void main(String[] args) {
        Order ord = new Order();
        DessertItem i1 = new Candy("Candy Corn", 1.5, .25);
        DessertItem i2 = new Candy("Gummy Bears", .25, .35);
        DessertItem i3 = new Cookie("Chocolate Chip", 6, 3.99);
        DessertItem i4 = new IceCream("Pistachio", 2, .79);
        DessertItem i5 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        DessertItem i6 = new Cookie("Oatmeal Raisin", 2, 3.45);


        ord.add(i1);
        ord.add(i2);
        ord.add(i3);
        ord.add(i4);
        ord.add(i5);
        ord.add(i6);

        for (DessertItem n : ord.getOrderList()) {
            System.out.println(n.getName());
            
        }
        System.out.println("TOTAL ITEMS: "+ord.itemCount());
        


    }

    
}
