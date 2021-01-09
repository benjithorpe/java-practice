package multithreading;

public class UsingRunnable implements Runnable {

    @Override
    public void run() {
        countdown(100);
    }

    void countdown(int start) {
        for (int i = start; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Horrayyyyy!!!!");
                return;
            }
            System.out.println("down... " + i);
            sleep(2);
        }
    }


    void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ie) {
        }
    }

}
