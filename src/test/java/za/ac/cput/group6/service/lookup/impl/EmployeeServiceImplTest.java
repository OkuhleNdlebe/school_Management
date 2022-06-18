package za.ac.cput.group6.service.lookup.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.domain.user.Name;
import za.ac.cput.group6.service.lookup.IEmployeeService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {













    @SpringBootTest
    class EmployeeServiceimplTest {

        private final Name user = new Name.Builder()
                .setFirstName("Jetro")
                .setLastName("Nkuna")
                .build();

        private final Employee employee = new Employee.Builder()
                .staffId("BD4567Y")
                .email("bdyuop@gmail.com")
                .name(user)
                .build();
        @Autowired
        private IEmployeeService service;

        @BeforeEach
        void setUp() {
        }


        @Test
        void save() {
            Employee saved = service.save(employee);
            String employee1 = String.valueOf(employee);
            String show = String.valueOf(saved);
            assertAll(
                    () -> assertNotNull(saved),
                    () -> assertEquals(employee1, show)
            );
            System.out.println(saved);
        }


        @Test
        void read() {
            Employee saved = service.save(employee);
            Optional<Employee> read = service.read(saved.getStaffId());
            System.out.println(read);
            String employee1 = String.valueOf(saved);
            String show = String.valueOf(read.get());
            assertAll(
                    () -> assertTrue(read.isPresent()),
                    () -> assertEquals(employee1, show)
            );
        }

        @Test
        void delete() {
            this.service.delete(String.valueOf(employee));
        }

        @Test
        void findByStaffId() {
            Employee saved = service.save(employee);
            String employeeId = saved.getStaffId();
            List<Employee> employeeNameList = service.getAll(employeeId);
            System.out.println(employeeNameList);
            assertSame(1, employeeNameList.size());
        }

        @Test
        void getEmployeeNameFromEmail() {
            Employee saved = service.save(employee);
            if (service.isValidEmail(employee.getEmail()) == false) {
                System.out.println("Please input valid email.");
            } else {
                System.out.println(saved);
            }
        }
    }
}