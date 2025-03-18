public class Car extends Vehicle implements Drivable {

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

        System.out.println("Car start");
    }

    @Override
    public void stop(){
        System.out.println("Car stop");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }
}