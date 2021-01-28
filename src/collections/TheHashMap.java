// HashMap -> A data structure that stores key/value associations
package collections;

import java.util.HashMap;

public class TheHashMap {
    public static void main(String[] args) {
        // initialization
        HashMap<String, Integer> nameAndAge = new HashMap<>();

        // adding values to the hash map
        nameAndAge.put("John", 12);
        nameAndAge.put("Jane", 14);
        nameAndAge.put("Joe", 16);
        nameAndAge.put("Jenny", 18);
        nameAndAge.put("Jack", 13);

        // using System.out.println
        System.out.println(nameAndAge);
        System.out.println("=================\n");

        // using for each loop
        for(String name : nameAndAge.keySet()){
            System.out.println("Name: " + name);
            System.out.println("Age: " + nameAndAge.get(name));
        }
        System.out.println("===============\n");

        // using Map.Entry
        for(HashMap.Entry<String, Integer> entry : nameAndAge.entrySet()){
            System.out.println("Name: " + entry.getKey());
            System.out.println("Age: " + entry.getValue());
        }
    }
}
