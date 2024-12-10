package PresentationLayer.UserController;

import java.util.Scanner;

public abstract class Controller {

    Scanner scanner = new Scanner(System.in);

    private char role;

     void displayMenu(){

        System.out.println("Welcome to 'E-Library'!");
        System.out.println();
        System.out.println();
        System.out.println("Please, enter what is your role:");
        System.out.println();
        System.out.println("#========================#");
        System.out.println("|    User => enter U     |");
        System.out.println("|    Admin => enter A    |");
        System.out.println("#========================#");
        System.out.println();
        System.out.println("Please enter here: ");
        role = scanner.next().charAt(0);

    }
}
