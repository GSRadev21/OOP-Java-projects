import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

public class MyThread4 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread is running" + Thread.currentThread().getName());
    }
}
