import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

            Runnable task = () -> {
            System.out.println("Изпълнява се от " + Thread.currentThread().getName());
            try {
                Thread.sleep(123400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 3; i++) {
            executor.submit(task);
        }
        executor.shutdown();
    }
}