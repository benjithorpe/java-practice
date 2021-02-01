package generics;

// can only take/accept class that extends the Number Class
public class BoundedClass<T extends Number> {

    private T value;

    public BoundedClass(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }
}
