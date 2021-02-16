// The class can take any object
package generics;

public class GenericClass<T> {

    private T value;

    public GenericClass(T t) {
        this.value = t;
    }

    public T getValue(){
        return this.value;
    }

}
