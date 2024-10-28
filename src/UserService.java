public class UserService {
    public static final User[] users = new User[100];
    private static int pointer = 0;

    public void register(User user) {
        UserValidation userValidation = new UserValidation();
        if (!userValidation.validateUsername(user.getUsername())) {
            throw new RuntimeException("Invalid username");
        }
        users[pointer++] = user;
        System.out.println("User registered successfully: " + user.getUsername());
    }

    public void login(String username, String password) {

        boolean found = false;
        for (User u : users) {
            if (u != null && u.getUsername().equals(username) && u.getPassword().equals(password)) {
                System.out.println("login successfully");
                found = true;
            }
        }

        if (!found){
            System.out.println("Username or password incorrect");
        }

    }
}
