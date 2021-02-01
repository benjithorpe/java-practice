// LinkedList -> An ordered sequence that allows efficient insertions and removal at any location
package collections;

import java.util.LinkedList;

public class TheLinkedList {

    public static void main(String[] args) {
        // initialization
        LinkedList<String> names = new LinkedList<>();

        // adding values
        names.add("John");
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
