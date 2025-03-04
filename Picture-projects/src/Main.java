import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Pictures pictures = new Pictures();

        while (true) {

            System.out.println("Choose an option: ");
            System.out.println("1. Add a new picture");
            System.out.println("2. Delete an existing picture");
            System.out.println("3. Print all pictures by author");
            System.out.println("4. Print all pictures by price");
            System.out.println("5. Print all pictures by author and price");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Picture picture = new Picture();
                    pictures.addPicture(picture);
                    break;
                case 2:
                    System.out.println("Enter the id");
                    Integer idOfPicture = scanner.nextInt();
                    pictures.delPicture(idOfPicture);
                    break;
                case 3:
                    System.out.println("Enter the author");
                    pictures.disPictureByAuthor();
                    break;
                case 4:
                    pictures.disPictureByPrice();
                    break;
                case 5:
                    System.out.println("Enter the author");
                    pictures.disPriceOfPictureByAuthor();
                    break;
                default:
                    System.err.println("Please choose between given operations!");
            }
        }
    }
}