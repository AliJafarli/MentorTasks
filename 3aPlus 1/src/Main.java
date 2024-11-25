import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        int a = 1;
        while (true) {

            if(a == 1){
                System.out.println(n + " --------");
                a = ++n;

            }
            else if (a % 2 == 0) {
                a = a / 2;
                System.out.println(a);
            } else if(a % 2 == 1) {
                a = 3 * a + 1;
                System.out.println(a);
            }

        }


    }
}
