public class Mothorcyicle extends Vehicle implements Drivable {

    public String make;
    public String model;
    public int year;
    public int engineCC;
    public boolean hasSideCar;

    public Mothorcyicle(String make, String model, int year, int engineCC, boolean hasSideCar) {
        super(make, model, year);
        this.engineCC = engineCC;
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void start(){

        System.out.println("Mothorcyicle start");
    }

    @Override
    public void stop(){
        System.out.println("Mothorcyicle stopped");
    }

    @Override
    public void drive() {
        System.out.println("Mothorcycle drive");
    }
}

