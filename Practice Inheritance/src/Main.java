//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread carTherad = new Thread(() -> {

            System.out.println("The car is moving!");
        });

        carTherad.start();
        carTherad.join();
    }
}