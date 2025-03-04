public class Truck extends Vehicle {

    public String make;
    public String model;
    public int year;
    public float towingCapacity;
    public boolean fourWheelDrive;

    public Truck(String make, String model, int year, float towingCapacity, boolean fourWheelDrive) {
        super(make, model, year);
        this.towingCapacity = towingCapacity;
        this.fourWheelDrive = fourWheelDrive;
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
