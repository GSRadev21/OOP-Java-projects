public class MyThread5 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        String[] arr =  {"s", "a", "b", "c", "d", "e", "f", "g", "h", "m"};

        Thread t1 = new Thread(() -> {

          for(int i = 0; i < arr.length / 4; i++) {
              counter.increment();
              System.out.println(counter.getCount());
          }
        });
        Thread t2 = new Thread(() -> {

            for(int i = (arr.length / 4); i < arr.length / 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                counter.increment();
                System.out.println(counter.getCount());
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i = (arr.length / 3); i < arr.length / 2; i++) {
                counter.increment();
                System.out.println(counter.getCount());
            }
        });

        Thread t4 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i = (arr.length / 2); i < arr.length; i++) {
                counter.increment();
                System.out.println(counter.getCount());
            }
        });

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread.sleep(4000);
            System.out.println("The total num of elements is: " + counter.getCount());
    }
}
