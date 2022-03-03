package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class VerifyEmails {

    public void validateEmailFormat(String emailAddress) {

        String regex = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        assertTrue(matcher.matches());
    }
}
