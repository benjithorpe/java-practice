package functional.lambdas;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        LambdaDemo lamd = () -> System.out.println("Hello Empty Method!!");
//        lamd.emptyMethod();

//        LambdaDemo lamd = (String name) -> System.out.println("Hello " + name + "!!");
//        lamd.parameterMeth("John Doe");
//
        LambdaDemo lamd = (int a, int b) -> (a + b);
        System.out.println("Answer: " + lamd.calculate(1, 5));

        MyValue myval = (name) -> System.out.println("Hello, " + name);
        myval.greet("John Doe");

        MyValue.printValue("John Doe");
        MyValue.printValue(10);
        MyValue.printValue('Z');
        MyValue.printValue(20.5);

        List names2 = Arrays.asList("John","Jack","Mary","Joseph");
        List names = List.of("Johnny","Barbosa","Mary","Joseph");

        MyValue.printValue(names);
        MyValue.printValue(names2);
    }
}

interface MyValue {

    public void greet(String val);

    static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }
}
