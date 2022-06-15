package za.ac.cput.group6.util;

import org.springframework.util.StringUtils;

public class Helper {

    public static boolean isValidString(String s){
        if(s == null)
            return false;
        if(s.trim().equals(""))
            return false;
        return true;
    }

    public static boolean isValidPostalCode(int code){
        return code > 1000 && code < 9999;
    }

    public static boolean isEmptyOrNull(String str){
        return StringUtils.isEmpty(str);
    }
    public static String setEmptyIfNull( String str){
      //  if (isEmptyOrNull(str)) return StringUtils.EMPTY;
        return str;
    }
    public static void checkStringParam(String paramName, String paramValue){
       // if (isEmptyOrNull(paramValue))
            //throw new IllegalArgumentException(String.format("Invalid value for: %s"));
    }

}
