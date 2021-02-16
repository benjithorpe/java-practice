package singleton;

public class Main {

    public static void main(String[] args) {
        Singleton test = Singleton.getInstance();
        test.display();

        // this will not work
        // Singleton single = new Singleton();  // creates an error
    }
}
