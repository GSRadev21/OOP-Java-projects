class Main{

    public static void main(String[] args) {
        // Първа нишка: Отпечатване на числа от 1 до 10 //
        java.lang.Thread numberThread = new java.lang.Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
                try {
                    java.lang.Thread.sleep(500); // Пауза от 500 милисекунди
                } catch (InterruptedException e) {
                    System.out.println("Number thread was interrupted.");
                }
            }
        });

        // Втора нишка: Отпечатване на "Hello, Thread!" //
        java.lang.Thread messageThread = new java.lang.Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, Thread!");
                try {
                    java.lang.Thread.sleep(1000); // Пауза от 1 секунда //
                } catch (InterruptedException e) {
                    System.out.println("Message thread was interrupted.");
                }
            }
        });

        // Стартиране на нишките //
        numberThread.start();
        messageThread.start();

        // Изчакване на завършването на нишките //
        try {
            numberThread.join();
            messageThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Program finished!");
    }
}