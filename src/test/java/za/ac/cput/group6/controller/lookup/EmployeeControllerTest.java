package za.ac.cput.group6.controller.lookup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.domain.user.Name;
import za.ac.cput.group6.factory.lookup.CountryFactory;
import za.ac.cput.group6.factory.lookup.EmployeeFactory;
import za.ac.cput.group6.service.lookup.IEmployeeService;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class EmployeeControllerTest {

    @LocalServerPort private int port;
    @Autowired private TestRestTemplate restTemplate;
    @Autowired private EmployeeController controller;
    @Autowired private IEmployeeService service;

    private Name name;
    private Employee employee;
    private String baseUrl;



    @Test
    void init() {
        employee = EmployeeFactory.buildEmployee("909", "jnkuna97@gmail.com",name);
        assertNotNull(controller);
        assertNotNull(employee);
        System.out.println(employee);
    }
    @Test
    void save() {
        String url = baseUrl + "save/";
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemplate
                .postForEntity(url, this.employee, Employee.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void read() {
        String url = baseUrl + "read/" + this.employee.getStaffId();
        System.out.println(url);
        ResponseEntity<Employee> response = this.restTemplate.getForEntity(url, Employee.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.employee.getStaffId();
        this.restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseUrl + "all/";
        System.out.println(url);
        ResponseEntity<Employee[]> response =
                this.restTemplate.getForEntity(url, Employee[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length == 1)
        );
    }

    @Test
    void findByEmail() {
        String url = baseUrl + "get-by-email/" + this.employee.getEmail();
        System.out.println(url);
        Employee response = controller.save(employee);

        if (!service.isValidEmail(employee.getEmail())) {
            System.out.println("Please enter valid email.");
        } else {
            System.out.println("Email is valid ");
            System.out.println("Email belongs to : " + response);
        }



    }
}