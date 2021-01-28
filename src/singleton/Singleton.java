package singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        // exists only to stop instantiation
    }

    // static instance method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // other instance protected by singleton-ness
    // they can be any other methods that the object should access
    protected void display() {
        System.out.println("Hello there Singleton");
    }
}
