package Validate_numPhone;

import Validate_class.Validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumPhone {
    private static final String NUM_PHONE = "^[1-9]{2}[-]+[0]+\\d{9}$";
    public NumPhone() {}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NUM_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        NumPhone validateClass = new NumPhone();
        System.out.println(validateClass.validate("84-0456734723"));
    }
}
