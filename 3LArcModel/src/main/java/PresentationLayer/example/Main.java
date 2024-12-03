package PresentationLayer.example;

import PresentationLayer.Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import PresentationLayer.UserController;

public class Main {
    public static <Controller> void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController userController = context.getBean(UserController.class);
        userController.run();
    }
}