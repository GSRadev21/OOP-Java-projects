import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            es.execute((Runnable) new Task());
        }
        es.shutdown();
    }
}
