package za.ac.cput.group6.service.lookup;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.factory.lookup.CountryFactory;
import za.ac.cput.group6.repository.lookup.CountryRepository;
import za.ac.cput.group6.service.lookup.impl.CountryServiceImpl;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryServiceImplTest {

    @Autowired
    private CountryServiceImpl countryService;
    private static Country countryX = CountryFactory.createCountry("RU", "Zimbabwe");
    private static Country countryY = CountryFactory.createCountry("ZAR", "South Africa");

    @Test
    void a_create() {
        Country x = countryService.create(countryX);
        assertNotNull(countryService.create(countryY));
        assertNotNull(x);
        System.out.println(x);
    }

    @Test
    void b_read() {
        assertNotNull(countryService.read(countryX.getName()));
        System.out.println(countryService.read(countryX.getName()));
    }

    @Test
    void c_update() {
        countryX = new Country.Builder().copy(countryX).setName("Russia").build();
        countryX = countryService.update(countryX);
        assertEquals("Russia", countryX.getName());
        System.out.println(countryX.getName());
    }

    @Test
    void d_getAll() {
        assertEquals(2, countryService.getAll().size());
    }

    @Test
    void e_delete() {
        countryService.delete(countryY.getName());
        assertEquals(null, countryService.read("South Africa"));
        assertEquals(1, countryService.getAll().size());
    }
}