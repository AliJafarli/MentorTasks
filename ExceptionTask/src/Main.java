import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            System.out.println(a / b);
        } catch (Exception o) {
            System.out.println("salam");
        }

    }
}