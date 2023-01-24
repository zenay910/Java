package DessertShop;

public class DessertItem {
    private String name;
    //CONSTRUCTOR
    DessertItem(){
        name = "";
    }
    DessertItem(String n){
        name = n;
    }
    // SET AND GET
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    
}
