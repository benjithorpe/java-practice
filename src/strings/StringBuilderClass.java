// StringBuilder is not thread safe
// if one or more class are trying to access the same
// string, use StringBuffer instead
// StringBuffer does all the same things as StringBuilder
package strings;

public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("Hello World!");
        System.out.println("Initial: " + word);
        System.out.println("Length: " + word.length());
        System.out.println("Capacity: " + word.capacity());
        word.setCharAt(1, 'E'); // change the character at the index given
        System.out.println("Char At: " + word.charAt(0));
        System.out.println("Append: " + word.append(" of Java"));
        System.out.println("Insert: " + word.insert(word.length(), "."));
        System.out.println("Delete: " + word.deleteCharAt(11));
        System.out.println("Reverse: " + word.reverse());
    }
}
