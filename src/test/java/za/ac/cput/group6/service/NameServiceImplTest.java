/* NameServiceImplTest.java
 * Test for NameServiceImpl.
 * Author: Bokang Molaoa [218131097]
 * ADP3 June Assessment.
 * Date: 16 June 2022
 */
package za.ac.cput.group6.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.user.Name;
import za.ac.cput.group6.factory.user.NameFactory;
import za.ac.cput.group6.service.user.impl.NameServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NameServiceImplTest {

    @Autowired
    private NameServiceImpl service;
    private Name name = NameFactory.createName("Yellow", "Hun", "Bone");

    @Test
    void a_create() {
        assertNotNull(service.create(name));
    }

    @Test
    void e_delete() {
        service.delete(name);
        assertEquals(0, service.getAll().size());
    }

    @Test
    void b_getAll() {
        assertEquals(1, service.getAll().size());
    }

    @Test
    void c_findByFirstName() {
        assertEquals("Bone", service.findByFirstName("Yellow").get(0).getLastName());
    }

    @Test
    void d_findByLastName() {
        assertEquals("Yellow", service.findByLastName("Bone").get(0).getFirstName());
    }
}