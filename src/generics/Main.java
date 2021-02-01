package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n========== Generic Class ===========\n");

        GenericClass<String> john = new GenericClass<>("John");
        System.out.println("Value: " + john.getValue());

        System.out.println("\n========== Bounded Class ===========\n");

        BoundedClass<Integer> age = new BoundedClass<>(20);
        System.out.println("Value: " + age.getValue());
        // this will not work because of the restrictions
        // BoundedClass<String> name = new BoundedClass<>("John");

        System.out.println("\n========== Generic Method ===========\n");

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Becky");
        names.add("Zeus");
        names.add("Hannah");

        // add a new list into names
        names.addAll(Arrays.asList("Hello", "World"));

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(34);
        ages.add(26);
        ages.add(47);

        System.out.println("\nSorted Names");
        GenericMethods.sortItems(names.toArray());

        System.out.println("\nSorted Ages");
        GenericMethods.sortItems(ages.toArray());

        System.out.println("\n========== Bounded Method ===========\n");
        Integer[] ages2 = {12, 34, 7, 15, 26, 17, 8};
        String[] names2 = {"Joe", "Brian", "Orion", "Abel", "Tux", "Jonah", "cain"};

        BoundedMethods.sortNumbers(ages2);
        BoundedMethods.sortStrings(names2);

        // these wont work
        /*
            BoundedMethods.sortNumbers(names2);
            BoundedMethods.sortStrings(ages2);
         */
    }
}
