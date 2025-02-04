public class Car extends Vehicle {

    private String brand;
    private String model;
    private int year;
    int doors;

    public Car(String brand, String model, int year, int doors) {

        super(brand, model, year);
        this.doors = doors;
    }

    public void display() {
        super.display(brand,model,year);
        System.out.println("Doors: " + doors);
    }
}
