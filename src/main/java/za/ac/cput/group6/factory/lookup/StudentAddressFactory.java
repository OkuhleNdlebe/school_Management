package za.ac.cput.group6.factory.lookup;

import za.ac.cput.group6.domain.lookup.StudentAddress;
import za.ac.cput.group6.util.Helper;

public class StudentAddressFactory {
    public static StudentAddress createStudent(String studentId, String address) throws IllegalArgumentException{
        if (!Helper.isValidString(studentId) || !Helper.isValidString(address))
            throw new IllegalArgumentException("ÏllegalArgumentException");
        return new StudentAddress.Builder().setstudentId(studentId).setaddress(address).build();
    }
}
