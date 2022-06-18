package za.ac.cput.group6.factory.user;

import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.util.Helper;

public class StudentFactory {
    public static Student createStudent(String studentId, String email) throws IllegalArgumentException{
        if (!Helper.isValidString(studentId) || !Helper.isValidString(email))
            throw new IllegalArgumentException("ÏllegalArgumentException");
        return new Student.Builder().setstudentId(studentId).setemail(email).build();
    }

}
