package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n========== Bounded Class ===========\n");

        GenericClass<String> john = new GenericClass<>("John");
        BoundedClass<Integer> age = new BoundedClass<>(20);

        System.out.println("Value: " + john.getValue());
        System.out.println("Value: " + age.getValue());

        // this will not work because of the restrictions
        // BoundedClass<String> name = new BoundedClass<>("John");
        System.out.println("\n========== Bounded Methods ===========\n");

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jack");
        names.add("Josh");
        names.add("Jonah");

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(34);
        ages.add(26);
        ages.add(47);

        GenericMethods name1 = new GenericMethods();
        name1.display(names);  // displaying strings
        name1.display(ages);  // displaying integers
    }
}
