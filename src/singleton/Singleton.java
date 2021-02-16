package singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        // exists only to stop instantiation
    }

    /**
     * Returns an instance of singleton.
     *
     * <p>
     * If it is null, a new instance gets created. <br>
     * Else the instance is returned
     * </p>
     */
    public static Singleton getInstance() {
        return (instance == null) ? new Singleton() : instance;
    }

    // other instance protected by singleton-ness
    // they can be any other methods that the object should access
    protected void display() {
        System.out.println("Hello there Singleton");
    }
}
