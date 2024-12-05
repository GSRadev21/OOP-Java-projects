public class PrintNums implements Runnable {

    @Override
    public void start(){

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
  }
}