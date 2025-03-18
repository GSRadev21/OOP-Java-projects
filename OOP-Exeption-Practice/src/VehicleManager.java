import java.util.Scanner;
public class VehicleManager {

    Scanner sc = new Scanner(System.in);

    public String make;
    public String model;
    public int year;
    public int doors;
    public int engineCC;
    public boolean hasSideCar;

    public VehicleManager() {

        System.out.print("Enter make: ");
        make = sc.nextLine();
        System.out.print("Enter model: ");
        model = sc.nextLine();
        System.out.print("Enter number of doors: ");
        doors = sc.nextInt();
        System.out.print("Enter capacity of engine: ");
        engineCC = sc.nextInt();
        System.out.print("Enter does the care has a side car: ");
        hasSideCar = sc.nextBoolean();
    }

    public void menageVihacles() {

        try {
            System.out.print("Enter year: ");
            year = sc.nextInt();
            if (this.year < 1900) {
                throw new InvalidYearException("Invalid year: " + year);
            } else {

                Car car = new Car(make, model, year, doors, hasSideCar);
                Mothorcyicle mothorcyicle = new Mothorcyicle(make, model, year, doors, hasSideCar);

                car.start();
                car.drive();
                car.stop();
                mothorcyicle.start();
                mothorcyicle.drive();
                mothorcyicle.stop();

            }
        } catch (InvalidYearException e) {
            System.out.println(e.getMessage());
        }
    }
}
