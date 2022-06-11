package za.ac.cput.group6.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    // Checking is email is valid : created by Okuhle Ndlebe 28388619,

    public static boolean isEmailValid(String email)
    {
        //Validation: This checks if the email address is valid.
        //domain name must include at least 1 dot, domain name after the last dot can only consist of letters.
        String emailValidation = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailValidation);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches())
        {
            System.out.println("please type in a valid email");
            return false;
        }
        return true;
    }
}
