// Strings are Immutable ie: they cannot change
// a new String is created for each method called on that string
package strings;

import java.util.Arrays;

public class StringClass {

    public static void main(String[] args) {
        String word = "Hello World!";

        System.out.println("Original: " + word);
        // split words the use Arrays class to convert it to string
        System.out.println("Split: " + Arrays.toString(word.split(" ")));
        System.out.println("To Lowercase: " + word.toLowerCase());
        System.out.println("To Uppercase: " + word.toUpperCase());
        System.out.println("Concat: " + word.concat(" of Java"));
        System.out.println("To Lowercase: " + Arrays.toString(word.toCharArray()));
    }
}
