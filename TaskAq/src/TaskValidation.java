import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskValidation {
    public boolean validationTaskName(String taskName) {
        return !taskName.isEmpty();
    }

    public boolean validationDate(String date) {
        String regex = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";


        return Pattern.matches(regex, date);
    }


}
