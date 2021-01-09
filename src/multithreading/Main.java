package multithreading;

public class Main {

    public static void main(String[] args) {

        // creating a thread using runnable class
        // then using thread class to start the thread
        /*
        Runnable run1 = new UsingRunnable();
        Thread run1Thread = new Thread(run1);
        run1Thread.start();
         */
        // creating the same using just new instances
        new Thread(new UsingRunnable()).start();
        countup(0, 10);
    }

    static void countup(int start, int stop) {
        for (int i = start; i <= stop; i++) {
            if (i == stop) {
                System.out.println("Horrayyyyy!!!!");
                return;
            }
            System.out.println("up..." + i);
            sleep(2);
        }

    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ie) {
        }
    }

}
