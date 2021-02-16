/*
    // generic bounded method example

    public <T extends Type> return_type methodName(T parameter){
        // code here
    }
 */
package generics;

import java.util.Arrays;

public class BoundedMethods {

    public static <T extends Number> void sortNumbers(T[] numbers) {
        Arrays.sort(numbers);

        int count = 1;
        for (T number : numbers) {
            System.out.printf("(%d.)%s ", count, number);
            count++;
        }
        System.out.println();
    }

    public static <T extends String> void sortStrings(T[] items) {
        Arrays.sort(items);

        int count = 1;
        for (T item : items) {
            System.out.printf("(%d.)%s ", count, item);
            count++;
        }
        System.out.println();
    }
}
