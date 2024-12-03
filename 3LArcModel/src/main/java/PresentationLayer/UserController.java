package PresentationLayer;


import BusinessLogicLayer.User;
import BusinessLogicLayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Show Users");
            System.out.println("2. Add User");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> userService.getAllUsers().forEach(System.out::println);
                case 2 -> {
                    System.out.println("Enter User Name: ");
                    String name = scanner.next();
                    System.out.println("Enter User Age: ");
                    int age = scanner.nextInt();
                    userService.addUser(new User(name, age));
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
