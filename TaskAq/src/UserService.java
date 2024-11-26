import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
   private static List<User> users = new ArrayList<>();

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Email: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");

        String password = scanner.nextLine();

        for (User u : users) {
            if (u.getEmail().equals(username)) {
                System.out.println("Email is exist");
                return;
            }
        }
        User user = new User(username, password);
        users.add(user);
    }
    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String username = scanner.nextLine();

        System.out.print("Enter your old password: ");

        String password = scanner.nextLine();

        for (User u : users) {
            if (u.getEmail().equals(username) && u.getPassword().equals(password)) {
                u.setPassword(scanner.nextLine());
                return;
            }
        }

        System.out.println("Username or password incorrect");
    }
    public void AddTodoTask(){

    }

}
