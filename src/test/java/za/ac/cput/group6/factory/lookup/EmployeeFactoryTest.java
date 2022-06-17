package za.ac.cput.group6.factory.lookup;

/**EmployeeAddressFactoryTest.java
 * Test   for Employee Factory
 * Author: Nkuna Justin(219319820)
 * Date: 12 June 2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.domain.user.Employee;
import za.ac.cput.group6.domain.user.Name;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    private Employee employee;
    private Employee employee1;




    @Test
    void buildWithSuccess() {
        Name emp = new Name.Builder().setFirstName("Fortunate ").setLastName("Maluka").build();
        Employee employee = EmployeeFactory.buildEmployee("BD4567Y", "bdyuop@gmail.com", emp);

        System.out.println(employee);
        assertNotNull(employee);

    }

    @Test
    void buildWithError() {

        Name emp = new Name.Builder().setFirstName("Mike").setLastName("Long").build();

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                EmployeeFactory.buildEmployee(null, "bdyuop@gmail.com", emp));

        String exceptionMessage = exception.getMessage();
        assertSame(
                "STAFF ID REQUIRED",exceptionMessage
        );
    }








}