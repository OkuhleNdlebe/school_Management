package za.ac.cput.group6.service.lookup.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.domain.user.EmployeeAddress;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeAddressServiceImplTest {

    private final Address location = new Address.Builder()
            .setStreetNumber("22")
            .setStreetName("Barrack")
            .setPostalCode(8000)
            .build();

    private final EmployeeAddress employeeAddress = new EmployeeAddress.Builder()
            .setStaffId("001")
            .setAddress(location)
            .build();
    @Autowired
    private EmployeeAddressServiceImpl service;

    @Test
    void save() {
        EmployeeAddress saved = service.save(employeeAddress);
        String empAdd1 = String.valueOf(employeeAddress);
        String output = String.valueOf(saved);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(empAdd1, output)
        );
        System.out.println(saved);
    }

    @Test
    void read() {
        EmployeeAddress saved = service.save(employeeAddress);
        Optional<EmployeeAddress> read = service.read(saved.getStaffId());
        System.out.println(read);
        String empAdd1 = String.valueOf(saved);
        String output = String.valueOf(read.get());
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertEquals(empAdd1, output)
        );
    }

    @Test
    void delete() {
        this.service.delete(employeeAddress);
    }

    @Test
    void getAll() {
        EmployeeAddress saved = service.save(employeeAddress);
        String staffId = saved.getStaffId();
        List<EmployeeAddress> employeeAddressList = service.getAll(staffId);
        System.out.println(employeeAddressList);
        assertSame(1, employeeAddressList.size());
    }
}