package za.ac.cput.group6.repository.lookup;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.factory.lookup.CountryFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryRepositoryTest {

    @Autowired
    private CountryRepository repository;

    @Test
    void a_createCountry(){
        Country country = CountryFactory.createCountry("NBI", "Namibia");
        assertNotNull(repository.save(country));
        System.out.println(country.getName());
    }

    @Test
    void b_findByNameSuccess() {
        Country x = repository.findByName("Namibia");
        assertNotNull(x);
        System.out.println(x.getId()+", "+x.getName());
    }

    @Test
    void c_findByNameFail() {
        Country x = repository.findByName("Botswana");
        assertNull(x);
        System.out.println(x);
        System.out.println("Botswana NOT found");
    }
}