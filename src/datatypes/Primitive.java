package datatypes;

/**
 * Java has 8 primitive data types. All of Java's other data type are
 * constructed from these.
 */
public class Primitive {

    public static void main(String[] args) {
        // boolean - represents true or false values
        boolean isActive = false;

        // byte - represents 8-bit integer value (-128 to 127)
        byte num = 100;

        // char - represents a single character value (the use single quote or a binary number)
        char letter = 'a';

        // double - represents double precision floating values
        double number = 56.67356788877;

        // float - represents single precision floating value 
        // smaller than double and requires letter 'f' at the end of the number
        float floatingNumber = 56.774F;

        // int - represents integer values (-2.1 Billion to 2.1 Billion)
        int integer = 598_878_787;

        // long - represents long integer values (-9.2 Quintillion to 9.2 Quintillion)
        // larger than int and requires letter 'l' at the end of the number
        long longNumber = 8738493749738894L;

        // short - represents short values (-32,768 to 32,767)
        short shortNumber = 32_374;

    }
}
