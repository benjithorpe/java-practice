// HashSet -> An unordered collection that reject duplicates
package collections;

import java.util.HashSet;

public class TheHashSet {

    public static void main(String[] args) {
        // initialization
        HashSet<String> names = new HashSet<>();

        // adding values to the hash map
        names.add("John");
        names.add("Jane");
        names.add("Joe");
        names.add("Jenny");
        names.add("Jack");

        // using System.out.println
        System.out.println(names);
        System.out.println("=================\n");

        // using for each loop
        for (String name : names) {
            System.out.println("Name: " + name);
        }

    }
}
