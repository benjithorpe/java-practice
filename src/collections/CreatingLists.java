// the same principles can also work with colections
package collections;

import java.util.Arrays;
import java.util.List;

public class CreatingLists {

    public static void main(String[] args) {

        // using Arrays.asList();
        List<Integer> nums = Arrays.asList(2, 3, 4, 2, 5, 56, 66);

        // using List.of();
        List<Integer> ages = List.of(5, 6, 10, 8, 9, 9, 5, 4);

        // =========== printing the lists in different ways ==============
        // using enhanched for loop
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("\n======================\n");

        // using forEach() with new syntax
        ages.forEach(System.out::println);
        System.out.println("\n=======================\n");

        // another forEach() and lambda syntax
        nums.forEach((num) -> System.out.println(num));
        System.out.println("\n=======================\n");

        // another forEach() and lambda syntax with multiple statements
        nums.forEach((num) -> {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        });

        System.out.println("\n=======================\n");
    }
}
