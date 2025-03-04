import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Integer num1 = sc.nextInt();
            Integer num2 = sc.nextInt();
            Integer choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println(Double.valueOf(num1 % num2));
                break;
                case 2: System.out.println(Double.valueOf(num2 % num1));
                break;
                default: throw new InputMismatchException();
            }

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("The scanner was closed successfully.");
        }
    }
}