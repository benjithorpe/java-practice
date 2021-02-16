// StringBuilder is not thread safe
// if one or more class are trying to access the same
// string, use StringBuffer instead
// StringBuffer does all the same things as StringBuilder
package strings;

public class StringBuilderClass {

    public static void main(String[] args) {
        // instantiating the object
        StringBuilder word = new StringBuilder("Hello World!");
        System.out.println("Initial: " + word);

        // the length
        System.out.println("Length: " + word.length());

        // the capacity
        System.out.println("Capacity: " + word.capacity());

        // changing a value
        word.setCharAt(1, 'E'); // change the character at the index given

        // getting a character at specified number
        System.out.println("Char At: " + word.charAt(0));

        // add a word to the current word
        System.out.println("Append: " + word.append(" of Java"));

        // insert a word at specified index
        System.out.println("Insert: " + word.insert(word.length(), "."));

        // delete charaters
        System.out.println("Delete: " + word.deleteCharAt(11));

        // reverse the word
        System.out.println("Reverse: " + word.reverse());
    }
}
