package DessertShop;

import java.util.ArrayList;

public class Order {
    
    private ArrayList<DessertItem> order;

    Order(){
        order = new ArrayList<DessertItem>();
    }

    public ArrayList<DessertItem> getOrderList(){
        return order;
    }
    public void add(DessertItem n ){
        order.add(n);
        
    }
    public int itemCount(){
        return order.size();
    }
















}
