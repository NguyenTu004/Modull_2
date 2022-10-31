package Validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String VALIDATE_ACCOUNT = "^[_a-z0-9]{6,10}$";
    public AccountExample() {}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(VALIDATE_ACCOUNT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        System.out.println(accountExample.validate("tduyfoi  "));
    }
}
