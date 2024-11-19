public class Print {

    public void printString(String s) {
        if (s.length() > 10) {
            throw new RuntimeException("String too large");
        }

        System.out.println(s);
    }
}
