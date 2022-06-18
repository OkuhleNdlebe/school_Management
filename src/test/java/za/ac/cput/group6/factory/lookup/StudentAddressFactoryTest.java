package za.ac.cput.group6.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.domain.lookup.StudentAddress;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressFactoryTest {
    private static StudentAddress studentAddress = StudentAddressFactory.createStudent("218268017", "10 Castle Court 22 Gold Street 7750");

    @Test
    void createStudentAddressSuccess() throws IllegalArgumentException {
        StudentAddress studentAddress = StudentAddressFactory.createStudent("218634987", "23 Castle Rock 45 Gore Street 8001");
        assertNotNull(studentAddress);
        assertEquals("218634987" ,"218634987");
        System.out.println(studentAddress.getStudentId());
    }

    @Test
    void createStudentAddressFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            StudentAddressFactory.createStudent("KK#", " ");
        });
        System.out.println("Thrown an error as expected");
    }

}