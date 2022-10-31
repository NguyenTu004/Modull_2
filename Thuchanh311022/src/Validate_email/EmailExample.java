package Validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern ;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailExample  emailExample = new EmailExample();
        if (emailExample.validate("Anh12@gmail.com")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
