package DessertShop;

public class Sundae extends IceCream{
    private String toppingName;
    private double toppingPrice;

    Sundae(){
        toppingName = "";
        toppingPrice = 0.0;

    }
    Sundae(String x, int sco, double pps, String n, double s){
        super.setName(x);
        super.setScoopCount(sco);
        super.setPricePerScoop(pps);;
        toppingName = n;
        toppingPrice =s;
    }
    public void setToppingName(String n){
        toppingName=n;
    }
    public void setToppingPrice(double n){
        toppingPrice=n;
    }
    public String getToppingName(){
        return toppingName;
    }
    public double getToppingPrice(){
        return toppingPrice;
    }



    
}
