package RealEstate;


public class Property {
    private String streetAdress;
    private int zip;

    Property(){
        streetAdress = "";
        zip = 0;
    }
    Property(String a, int b){
        streetAdress = a;
        zip =b;
    }

    public String getStreetAdress(){
        return streetAdress;
    }
    public int getZip(){
        return zip;
    }

    public void setStreetAdress(String a){
        streetAdress = a;
    }
    public void setZip(int a){
        zip = a;
    }


    
}
