package DessertShop;

public class Cookie extends DessertItem{
    private int cookieQty;
    private double pricePerDozen;

    Cookie(){
        super.setName("");
        cookieQty = 0;
        pricePerDozen = 0.0;
    }
    Cookie(String x, int n, double s){
        super.setName(x);
        cookieQty = n;
        pricePerDozen = s;
    }
    public void setCookieQty(int n){
        cookieQty=n;
    }
    public void setPricePerDozen(double n){
        pricePerDozen=n;
    }
    public double getCookieQty(){
        return cookieQty;
    }
    public double getPricePerDozen(){
        return pricePerDozen;
    }


    
}
