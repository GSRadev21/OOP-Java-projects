import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            String name = scanner.nextLine(), type = scanner.nextLine(), sound = scanner.nextLine();
            int age = scanner.nextInt();

            Animal ani = new Animal(name, type, age, sound);

           animals.add(ani);
        }

        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).getName());
            System.out.println(animals.get(i).getType());
            System.out.println(animals.get(i).getAge());
            animals.get(i).makeSound();
        }
    }
}