// HashMap -> A data structure that stores key/value associations
package collections;

import java.util.HashMap;
import java.util.Map;

public class TheHashMap {

    public static void main(String[] args) {
        // initialization
        HashMap<String, Integer> person = new HashMap<>();

        // adding values to the hash map
        person.put("John", 12);
        person.put("Jane", 14);
        person.put("Joe", 16);
        person.put("Jenny", 18);
        person.put("Jack", 13);

        // using System.out.println
        System.out.println(person);
        System.out.println("=================\n");

        // using for each loop and keySet()
        for (String name : person.keySet()) {
            System.out.printf("Name: %s, Age: %d\n", name, person.get(name));
        }

        System.out.println("===============\n");

        // using for each loop and Map.Entry (entrySet())
        for (Map.Entry<String, Integer> entry : person.entrySet()) {
            System.out.printf("Name: %s, Age: %d\n", entry.getKey(), entry.getValue());
        }

    }
}
