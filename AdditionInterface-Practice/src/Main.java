import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator(num1, num2);

        System.out.println(calculator.add(num1, num2));

    }
}