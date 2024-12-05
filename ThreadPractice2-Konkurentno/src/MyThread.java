public class MyThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Multithreading in progress...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
