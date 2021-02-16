package multithreading;

public class ExtendingThread extends Thread {

    static void countup(int start, int stop) {
        for (int i = start; i <= stop; i++) {
            try{
                sleep(1000);
            }catch(InterruptedException e){
            }

            if (i == stop) {
                System.out.println("Horrayyyyy!!!!");
                return;
            }
            System.out.println("up..." + i);
        }
    }

    @Override
    public void run() {
        countup(0, 10);
    }
}
