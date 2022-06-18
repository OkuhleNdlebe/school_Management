package za.ac.cput.group6.factory.lookup;

/**EmployeeAddressFactoryTest.java
 * Test   for Employee Address Factory
 * Author: Nkuna Justin(219319820)
 * Date: 12 June 2022
 */

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import za.ac.cput.group6.domain.user.EmployeeAddress;
import za.ac.cput.group6.domain.lookup.Address;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    private EmployeeAddress employeeAddress;
    private EmployeeAddress employeeAddress1;

    @BeforeEach
    void setUp() {
        Address address = new Address.Builder().setStreetNumber("22").setStreetName("Barrack Street").build();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("BD2345", address);
        employeeAddress1 = employeeAddress;
    }

    @Test
    void buildWithSuccess() {
        Address address= new Address.Builder().setStreetNumber("22").setStreetName("Barrack Street").build();
        EmployeeAddress employeeAddress = EmployeeAddressFactory.build("001", address);

        System.out.println(employeeAddress);
        assertNotNull(employeeAddress);
    }






        @Test
        void buildWithError() {
            Address address = new Address.Builder().setStreetNumber("22").setStreetName("Barrack Street").build();

            Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    EmployeeAddressFactory.build("001", null));

            String exceptionMessage = exception.getMessage();

        }

    }



