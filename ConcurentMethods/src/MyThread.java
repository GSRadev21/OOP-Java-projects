public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("MyThread is running" + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();

        t1.join();
        t1.start();

    }
}
