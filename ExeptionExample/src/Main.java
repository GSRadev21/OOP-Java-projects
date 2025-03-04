import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Грешка: Деление на нула!");
        } finally {
            System.out.println("Този код се изпълнява винаги.");
        }
    }
    public void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
    }
}