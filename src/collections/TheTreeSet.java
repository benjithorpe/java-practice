// TreeSet -> A sorted set
package collections;

import java.util.TreeSet;

public class TheTreeSet {

    public static void main(String[] args) {
        // initialization
        TreeSet<String> names = new TreeSet<>();

        // adding values to the hash map
        names.add("John");
        names.add("Jane");
        names.add("Joe");
        names.add("Benny");
        names.add("Alex");

        // using System.out.println
        System.out.println(names);
        System.out.println("=================\n");

        // using for each loop
        for (String name : names) {
            System.out.println("Name: " + name);
        }

    }
}
