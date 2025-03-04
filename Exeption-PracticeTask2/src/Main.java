import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {

            File file = new File("C:\\Users\\GSRadev21\\Documents\\File.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}