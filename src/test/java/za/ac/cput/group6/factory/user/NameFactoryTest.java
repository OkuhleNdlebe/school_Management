/* NameFactoryTest.java
 * Test Name Factory
 * Author: Bokang Molaoa (218131097)
 * ADP3 June Assessment.
 * Date: 9 June 2022
 */
package za.ac.cput.group6.factory.user;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.domain.user.Name;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NameFactoryTest {

    @Test
    void createNameSuccess() throws IllegalArgumentException {
        Name name = NameFactory.createName("Yellow", " ", "Bone");
        assertNotNull(name);
        assertEquals("Yellow", name.getFirstName());
        System.out.println(name.getLastName());
    }

    @Test
    void createNameFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            NameFactory.createName(" ", "Sweet", "Bone");
        });
        System.out.println("Thrown an error as expected");
    }
}