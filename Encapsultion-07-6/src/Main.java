import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side 'A':");
        double sideA = scanner.nextDouble();
        System.out.println("Enter the side 'B':");
        double sideB = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(sideA, sideB);

        System.out.println(rectangle.getArea());
    }
}