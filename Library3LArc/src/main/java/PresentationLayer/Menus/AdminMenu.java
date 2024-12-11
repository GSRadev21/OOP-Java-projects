package PresentationLayer.Menus;

import DataLayer.models.BookModel;
import BusinessLogicLayer.Service.Service;
import java.util.Scanner;

public class AdminMenu {

    private String title;
    private String author;
    private String publisher;
    private Integer yearOfPublication;
    Scanner scanner = new Scanner(System.in);

    public void adminMenu() {

        System.out.print("Enter book's title: ");
        title = scanner.nextLine();
        System.out.print("Enter book's author: ");
        author = scanner.nextLine();
        System.out.print("Enter book's publisher: ");
        publisher = scanner.nextLine();
        System.out.print("Enter book's year of publication: ");
        yearOfPublication = scanner.nextInt();

        BookModel book = new BookModel(title, author, publisher, yearOfPublication);




    }
}
