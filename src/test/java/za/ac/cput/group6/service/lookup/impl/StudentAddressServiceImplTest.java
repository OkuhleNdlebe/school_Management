package za.ac.cput.group6.service.lookup.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.domain.lookup.StudentAddress;
import za.ac.cput.group6.factory.lookup.StudentAddressFactory;
import za.ac.cput.group6.factory.user.StudentFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentAddressServiceImplTest {
    @Autowired
    private StudentAddressServiceImpl studentAddressService;
    private static StudentAddress studentAddress = StudentAddressFactory.createStudent("218268017", "10 Castle rock Gold Street 8001");



    @Test
    void a_start(){
        assertNotNull(studentAddressService.create(studentAddress));
    }

    @Test
    void b_create() {
        assertNotNull(studentAddressService.create(studentAddress));
    }

    @Test
    void c_read() {
        Optional<StudentAddress> read = this.studentAddressService.read(studentAddress.getStudentId());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertSame(this.studentAddressService, read.get())
        );
    }

    @Test
    void d_update() {
        StudentAddress x = new StudentAddress.Builder().copy(studentAddress).setstudentId("216986324").build();
        assertNotNull(studentAddressService.create(studentAddress));
    }

    @Test
    void f_delete() {
        studentAddressService.delete(studentAddress);
    }

    @Test
    void e_getAll() {
        assertEquals(1, studentAddressService.getAll().size());
    }

}