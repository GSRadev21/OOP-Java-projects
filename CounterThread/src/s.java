import java.util.concurrent.atomic.AtomicInteger;

public class s {


    private int count = 0;

    public synchronized void incrementByOne(){
        count++;
        System.out.println(count);
    }

    public int getCount(){
        return count;
    }

    public void main(String[] args)  {

        s counter = new s();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
            counter.incrementByOne();
        }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                counter.incrementByOne();
            }
        });

        Thread thread3 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                counter.incrementByOne();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final Count:" + counter.getCount());

    }
}
