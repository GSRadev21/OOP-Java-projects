import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            String name = scanner.nextLine(), type = scanner.nextLine(), sound = scanner.nextLine();
            int age = scanner.nextInt();

            Animal animal = new Animal(name, type, age, sound);
            animals.add(animal);
        }
            System.out.println(animals);


    }
}