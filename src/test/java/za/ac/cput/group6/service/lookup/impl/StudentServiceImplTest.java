package za.ac.cput.group6.service.lookup.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.factory.user.StudentFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentServiceImplTest {

    @Autowired
    private StudentServiceImpl studentService;
    private static Student student1 = StudentFactory.createStudent("218268017", "xolamngen@gmail.com");



    @Test
    void a_start(){
        assertNotNull(studentService.create(student1));
    }

    @Test
    void b_create() {
        assertNotNull(studentService.create(student1));
    }

    @Test
    void c_read() {
        Optional<Student> read = this.studentService.read(student1.getStudentId());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertSame(this.studentService, read.get())
        );
    }

    @Test
    void d_update() {
        Student x = new Student.Builder().copy(student1).setstudentId("216986324").build();
        assertNotNull(studentService.create(student1));
    }

    @Test
    void f_delete() {
        studentService.delete(student1);
    }

    @Test
    void e_getAll() {
        assertEquals(1, studentService.getAll().size());
    }
}