package interfaces;

/**
 * Any class that implements an Interface must also<br>
 * override all the methods of that Interface, except<br>
 * if the Interface has default and static methods.
 *
 * All abstract methods of an interface must be overridden.
 *
 */
public class Main {

    public static void main(String[] args) {
        Inner1 in1 = new Inner1();
        System.out.println(in1.calculate(4, 6));
    }

    static class Inner1 implements DefaultInterface {

        @Override
        public void showDetails() {
            System.out.println("Overriding Details in the interface");
        }

        @Override
        public void anotherMethod() {
            System.out.println("Overriding the other method in the interface");
        }

        @Override
        public String displayName(String name) {
            return "Name: " + name;
        }

        @Override
        public int calculate(int a, int b) {
            return a + b;
        }

    }

    class Inner2 implements InterfaceMethodsWithBody {

        @Override
        public void normalMentod() {
            System.out.println("Overriding the normal method of the interface");
        }

    }
}
