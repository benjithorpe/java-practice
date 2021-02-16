package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheCollectionsClass {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(
                List.of("John", "Jane", "Jack", "Jenny"));
        names.add("Benny");

        // makes the list unmodifiable(cant change anything inside it)
        System.out.println(Collections.unmodifiableList(names));

        System.out.println(names);

        names.add("Mary");
        names.add("Penny");

        // special syntax to print out the values
        // they are printed vertically
        names.forEach(System.out::println);

        // sorting the names
        System.out.println("\n== Sorted names ==\n");
        Collections.sort(names);
        names.forEach(System.out::println);

    }
}
