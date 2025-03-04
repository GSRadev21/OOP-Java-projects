public class Vehicle {

    public String make;
    public String model;
    public int year;

    public Vehicle(String make, String model, int year) {
       this.make = make;
       this.model = model;
       this.year = year;
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}
