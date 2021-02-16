package keyboardinput;

import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {
        // use Scanner class to read a string, character, number etc.
        // import the Scanner class (import java.util.Scanner;)
        // create a Scanner object (Scanner scanner = new Scanner(System.in))
        Scanner scanner = new Scanner(System.in);
        // read from the keyboard and send it to a variable
        int number = scanner.nextInt();
        // print the value out
        System.out.println(number);

    }

}
