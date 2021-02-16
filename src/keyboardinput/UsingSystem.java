package keyboardinput;

public class UsingSystem {

    public static void main(String[] args) throws java.io.IOException {
        /**
         * Java has various ways of accepting input from the keyboard.
         */

        // Use the System.in.read() to read a single character.
        // but you must wrap it in a try ... catch block 
        // or throw an exception on the whole method where it is visible
        char character = (char) System.in.read();
        System.out.println(character);

    }

}
