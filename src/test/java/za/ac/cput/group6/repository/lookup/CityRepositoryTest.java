package za.ac.cput.group6.repository.lookup;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.factory.lookup.CityFactory;
import za.ac.cput.group6.factory.lookup.CountryFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CityRepositoryTest {
    @Autowired
    private CityRepository repository;
    private static Country country = CountryFactory.createCountry("ZAR", "South Africa");

    @Test
    void addCity() {
        City city = CityFactory.createCity("CPT", "Cape Town", country);
        assertNotNull(repository.save(city));
        System.out.println(city.getId()+", "+city.getName()+", "+city.getCountyId());
    }

    @Test
    void findByName() {
        City c = repository.findByName("Cape Town");
        assertNotNull(c);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getCountyId());
    }
}