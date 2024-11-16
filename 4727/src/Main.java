import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        solution(number);
    }

    private static void solution(String number) {
        int firstIndex = -1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == 'f') {
                firstIndex = i;
                break;
            }
        }

        int secondIndex = -1;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == 'f') {
                secondIndex = i;
                break;
            }
        }

        if (firstIndex == - 1) {
            System.out.println("-2");
        }
        else if(firstIndex == secondIndex){
            System.out.println("-1");
        }
        else {
            for (int i = firstIndex + 1; i < number.length(); i++) {
                if (number.charAt(i) == 'f') {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

}