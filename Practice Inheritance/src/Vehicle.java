public class Vehicle {

    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display(String brand, String model, int year) {
        System.out.println("Brand: " + this.brand + "Model: " + this.model + "Year: " + this.year);
    }

}
