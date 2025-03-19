public class MyThread3 implements Runnable {

    @Override
    public void run() {
        System.out.println("MyThread is running" + Thread.currentThread().getName());
    }
}
