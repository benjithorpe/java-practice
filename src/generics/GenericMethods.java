/*
    //generic method example

    public <T> return_type methodName(T parameterName){
        // code here
    }
 */
package generics;

import java.util.Arrays;

public class GenericMethods {

    // they can take in any type of list
    public static <T> void sortItems(T[] items) {
        Arrays.sort(items); // sort the items

        int count = 1;
        for (T item : items) {
            System.out.printf("%d. %s\n", count, item);
            count++;
        }
    }
}
