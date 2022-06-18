package za.ac.cput.group6.controller.lookup;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.domain.user.EmployeeAddress;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressControllerTest {

    @Autowired
    private EmployeeAddressController controller;
    @Autowired private TestRestTemplate restTemplate;
    private String baseUrl = "http://localhost:8080/country";
    private static Employee employee;
    private Address address;
    private EmployeeAddress employeeAddress;


    @Test
    void save() {
        String url = baseUrl + "save/";
        System.out.println(url);
        ResponseEntity<EmployeeAddress> response = this.restTemplate
                .postForEntity(url, this.employeeAddress, EmployeeAddress.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void read() {
        String url = baseUrl + "read/" + this.employeeAddress.getStaffId();
        System.out.println(url);
        ResponseEntity<EmployeeAddress> response = this.restTemplate
                .getForEntity(url, EmployeeAddress.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.employeeAddress.getStaffId();
        this.restTemplate.delete(url);
    }

    @Test
    void getALl() {
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<EmployeeAddress[]> response = this.restTemplate
                .getForEntity(url, EmployeeAddress[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 1)
        );
    }
}