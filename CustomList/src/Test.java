public class Test<T> {
    private T value;

    public Test(T value) {
        this.value = value;
    }

    public Test() {
    }

    public void add(T value) {

        this.value=value;
    }
    public T getValue() {

        return value;
    }

}
