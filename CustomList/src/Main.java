public class Main {
    public static void main(String[] args) {
        Test<Integer> test1 = new Test<>();
        Test<Integer> test2 = new Test<>(1);
        Test<String> test3 = new Test<>("Generics");

        test1.add(3);
        test2.add(7);
        test3.add("Hi");


    }
}