import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine(), author = scanner.nextLine();
        double price = scanner.nextDouble();

        MyBook book1 = new MyBook(title, author, price);

        book1.getDetails(title, author, price);
    }
}