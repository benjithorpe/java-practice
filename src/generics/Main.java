package generics;

public class Main {

    public static void main(String[] args) {
        GenericClass<String> john = new GenericClass<>("John");
        GenericClass<Integer> jane = new GenericClass<>(21);

        BoundedClass<Integer> age = new BoundedClass<>(20);

        System.out.println("Value: " + john.getValue());
        System.out.println("Value: " + age.getValue());
    }
}
