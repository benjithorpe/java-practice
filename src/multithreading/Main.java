package multithreading;

public class Main {

    public static void main(String[] args) {

        // using a thread class
        new ExtendingThread().start();

        // using runnable class
        Runnable run1 = new UsingRunnable();
        Thread run1Thread = new Thread(run1);
        run1Thread.start();

    }

}
