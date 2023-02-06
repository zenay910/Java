package RealEstate;

public class Condo extends Residential {
    private int floorLvl;

    public Condo() {
        super("", 0, 0, 0, 0);
        this.floorLvl = 0;
    }
    public Condo(String a, int b, int bedCount, int bathCount, int sqFootage, int floorLvl) {
        super(a, b, bedCount, bathCount, sqFootage);
        this.floorLvl = floorLvl;
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }

    

    

}
