package za.ac.cput.group6.factory.user;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.factory.lookup.CityFactory;
import za.ac.cput.group6.factory.lookup.CountryFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    private static Student student = StudentFactory.createStudent("218268017", "xolamngeni@gmail.com");

    @Test
    void createStudentSuccess() throws IllegalArgumentException {
        Student student = StudentFactory.createStudent("209125367", "xmngeni2013@mysbf.co.za");
        assertNotNull(student);
        assertEquals("209125367", "209125367");
        System.out.println(student.getStudentId());
    }

    @Test
    void createStudentFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            StudentFactory.createStudent("245789454", "none@mtn.com ");
        });
        System.out.println("Thrown an error as expected");
    }


}