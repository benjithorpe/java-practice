package interfaces;

public interface InterfaceMethodsWithBody {

    default void defaultMethod() {
        System.out.println("This is a default method in an Interface!!");
    }

    static void staticMethod() {
        System.out.println("A static method in an Interface");
    }

    // normal mentods without bodies
    public void normalMentod();
}
