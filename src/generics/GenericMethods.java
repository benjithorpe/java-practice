package generics;

import java.util.List;

public class GenericMethods {

    // they can take in any type of list
    public void display(List<?> items) {
        for (var item : items) {
            System.out.println("Hello, " + item);
            System.out.println(item.getClass());
        }
    }
}
