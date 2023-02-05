package string;

import java.util.ArrayList;
import java.util.regex.*;
public class Regularexpressionex {
    public static void main(String[] args) {
        ArrayList emails = new ArrayList();
        emails.add("kolteshubham517@gmail.com");
        emails.add("kolteshubham6856@gmail.com");
        emails.add("sk@gmail.com");
        emails.add("@gmail.com");
        emails.add("");
        emails.add("1315464646@");

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        for(Object email : emails){
            Matcher matcher = pattern.matcher((CharSequence) email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
