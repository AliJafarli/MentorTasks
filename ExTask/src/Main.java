import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Print p = new Print();
        while (true){
            Scanner s = new Scanner(System.in);
            String string = s.nextLine();
            try{
                p.printString(string);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}