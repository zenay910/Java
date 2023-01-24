package DessertShop;

public class Candy extends DessertItem{

    private double candyWeight;
    private double pricePerPound;
    
    //CONSTRUCTOR

    Candy(){
        super.setName("");
        candyWeight = 0.0;
        pricePerPound = 0.0;
    }
    Candy(String x, double n, double s){
        super.setName(x);
        candyWeight = n;
        pricePerPound = s;
    }

    // SET AND GET

    public void setCandyWeight(double n){
        candyWeight=n;
    }
    public void setPricePerPound(double n){
        pricePerPound=n;
    }
    public double getCandyWeight(){
        return candyWeight;
    }
    public double getPricePerPound(){
        return pricePerPound;
    }
}
