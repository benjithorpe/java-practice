// ArrayList -> An indexed sequence that grows and shrinks dynamically (advance array)
package collections;

import java.util.ArrayList;

public class TheArrayList {

    public static void main(String[] args) {
        // initialization
        ArrayList<String> names = new ArrayList<>();

        // adding values
        names.add("Alex");
        names.add("Jack");
        names.add("Jenny");
        names.add("Benny");
        names.add("Kate");

        // using System.out
        System.out.printf("Names: %s\n\n", names);

        // using for each
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
