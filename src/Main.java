public class Main {
    public static void main(String[] args) {
        User user = new User("John", "123");
        User user2 = new User("Shamil", "123");
        User user3 = new User("Ali", "123");

        UserService userService = new UserService();

        userService.register(user);
        userService.register(user2);
        userService.register(user3);

        userService.login("Ali", "123");

        for (User tempUser : UserService.users) {
            if (tempUser == null) break;
            System.out.println(tempUser);
        }
    }
}