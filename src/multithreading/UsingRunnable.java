package multithreading;

public class UsingRunnable implements Runnable {

    @Override
    public void run() {
        countdown(10);
    }

    void countdown(int start) {
        for (int i = start; i >= 0; i--) {
            sleep();
            if (i == 0) {
                System.out.println("Horrayyyyy!!!!");
                return;
            }
            System.out.println("down... " + i);
        }
    }

    void sleep(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
        }
    }
}
