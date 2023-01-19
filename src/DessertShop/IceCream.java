package DessertShop;

public class IceCream extends DessertItem{
    private int scoopCount;
    private double pricePerScoop;

    IceCream(){
        super.setName("");
        scoopCount = 0;
        pricePerScoop = 0.0;

    }
    IceCream(String x, int n, double s){
        super.setName(x);
        scoopCount = n;
        pricePerScoop =s;
    }
    public void setScoopCount(int n){
        scoopCount=n;
    }
    public void setPricePerScoop(double n){
        pricePerScoop=n;
    }
    public double getScoopCount(){
        return scoopCount;
    }
    public double getPricePerScoop(){
        return pricePerScoop;
    }



    
}
