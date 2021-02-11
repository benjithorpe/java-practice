package enumeration;

public class Main {

    public static void main(String[] args) {

        // printing all enum values
        for (EmptyEnum game : EmptyEnum.values()) {
            System.out.println("-> " + game);
        }

        System.out.println("\n================\n");

        // print enum and their number(ordinal)
        for (EmptyEnum game : EmptyEnum.values()) {
            System.out.println(game.ordinal() + ". " + game);
        }

        System.out.println("\n================\n");

        // printing enum with constructors
        System.out.println("Enum with constructor\n");

        for (EnumWithConstructor name : EnumWithConstructor.values()) {
            System.out.println("Name: " + name);
        }

        System.out.println("\n================\n");

        // printing name and age
        for (EnumWithConstructor name : EnumWithConstructor.values()) {
            System.out.println("Number " + (name.ordinal() + 1));
            System.out.println("Name: " + name);
            System.out.println("Age: " + name.getAge());
            System.out.println();
        }
    }
}
