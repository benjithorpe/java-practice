package multithreading;

public class Main {

    public static void main(String[] args) {

        // using a thread class
        new ExtendingThread().start();

        // using runnable class
        Runnable run1 = new UsingRunnable();
        Thread run1Thread = new Thread(run1);
        run1Thread.start();

        // combining runnable and thread
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread and Runnable Combination");
            }
        });

        thread1.start(); // starts the thread

        // Using Lambdas
        Thread lamThread = new Thread(() -> {
            System.out.println("Runnable Lambda!!");
        });
        lamThread.start();

    }

}
