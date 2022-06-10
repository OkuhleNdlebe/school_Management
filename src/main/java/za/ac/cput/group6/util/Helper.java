package za.ac.cput.group6.util;
import java.util.UUID;
public class Helper {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
