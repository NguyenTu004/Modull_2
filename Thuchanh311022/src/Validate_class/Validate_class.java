package Validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_class {
    private static final String VALIDATE_CLASS = "^[C|P|A]+[0-9]{4}+[G|H|I|K|L|M]$";
    public Validate_class() {}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(VALIDATE_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Validate_class validateClass = new Validate_class();
        System.out.println(validateClass.validate("84-0456734723"));
    }

}
