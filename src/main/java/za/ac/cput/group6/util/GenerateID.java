package za.ac.cput.group6.util;

import java.util.UUID;

public class GenerateID {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}
