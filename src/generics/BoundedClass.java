package generics;

// can only take/accept a number
public class BoundedClass<T extends Number> {

    private T value;

    public BoundedClass(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }
}
