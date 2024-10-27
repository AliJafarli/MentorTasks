import java.util.regex.Pattern;

public class UserValidation {
    private static final String PASSWORD_REGEX = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    public static void validateUsername(String username) throws Exception {
        if (username.length() > 10) {
            throw new Exception("username uzunluğu 10 çox olmamalıdır ");
        }
    }

    public static void validatePassword(String password) throws Exception {
        if (!pattern.matcher(password).matches()) {
            throw new Exception("Ən azı 8 simvol , ən azı bir böyük hərf ,ən azı 1 balaca hərf,bir rəqəm və bir xüsusi simvol olmalıdır");
        }
    }

}
