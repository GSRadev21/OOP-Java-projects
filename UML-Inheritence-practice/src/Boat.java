public class Boat extends Vehicle {

    public String make;
    public String model;
    public int year;
    public float length;
    public String hullType;

    public Boat(String make, String model, int year, float length, String hullType) {
        super(make, model, year);
        this.length = length;
        this.hullType = hullType;
    }

    @Override
    public void start(){
        super.start();
    }

    @Override
    public void stop(){
        super.stop();
    }
}
