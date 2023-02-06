package RealEstate;

public class House extends Residential{

    private int yardAcres;


    public House() {
        super("", 0, 0, 0, 0);
        this.yardAcres = 0;
    }

    public House(String a, int b, int bedCount, int bathCount, int sqFootage, int yardAcres) {
        super(a, b, bedCount, bathCount, sqFootage);
        this.yardAcres = yardAcres;
    }

    public int getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(int yardAcres) {
        this.yardAcres = yardAcres;
    }
    
    


    
}
