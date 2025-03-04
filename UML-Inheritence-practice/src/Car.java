public class Car extends Vehicle {

    public String make;
    public String model;
    public int year;
    public int doors;
    public boolean hatchback;

    public Car(String make, String model, int year, int doors, boolean hatchback) {
        super(make, model, year);
        this.doors = doors;
        this.hatchback = hatchback;
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
