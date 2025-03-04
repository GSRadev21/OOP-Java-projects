public class Bicycle extends Vehicle {

    public String make;
    public String model;
    public int year;
    public int gears;
    public boolean electricAssist;

    public Bicycle(String make, String model, int year, int gears, boolean electricAssist) {
        super(make, model, year);
        this.gears = gears;
        this.electricAssist = electricAssist;
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
