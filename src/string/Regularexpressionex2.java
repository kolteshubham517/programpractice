package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpressionex2 {
    public static void main(String[] args) {
        String email = "kolteshubham6856@gmail.com";
       //String email = "ghfgjhfgjgjg";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("valid email address");
        } else {
            System.out.println("invalid email address");
        }
    }
}


/*class Regularexpressionex2{
    public static void main(String a[]) {
        System.out.println("shubham kolte");
    }
}*/
