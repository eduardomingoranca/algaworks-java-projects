import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

    public static void main(String[] args) {
        String[] emails = {"johannklimt@mail.com", "mary@", "antoinesoisson@mail"};

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        for (String email: emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
                System.out.println(email + " eh um email valido.");
        }
    }
}
