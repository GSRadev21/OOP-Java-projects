/*public class SharedCounter {

        private int count = 0;

        public synchronized void incrementByOne(){
            count++;

        }
        public synchronized void incrementByTwo(){
            count+=2;
        }

        public int getCount() {
            return count;
        }
        public static void main(String[] args){
            SharedCounter counter = new SharedCounter();

            Thread thread1 = new Thread(() ->{
                for (int i = 0; i < 10000; i++){
                    counter.incrementByOne();
                }
            });
            Thread thread2 = new Thread(()-> {
                for (int i = 0; i < 10000; i++){
                    counter.incrementByTwo();
                }
            });
            thread1.start();
            thread2.start();
            try{
                thread1.join();
                thread2.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Final Count:" + counter.getCount());
        }
}*/