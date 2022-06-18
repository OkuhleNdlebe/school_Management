package za.ac.cput.group6.service.lookup;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.factory.lookup.CityFactory;
import za.ac.cput.group6.factory.lookup.CountryFactory;
import za.ac.cput.group6.service.lookup.impl.CityServiceImpl;
import za.ac.cput.group6.service.lookup.impl.CountryServiceImpl;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CityServiceImplTest {

    @Autowired
    private CityServiceImpl cityService;

    @Autowired
   private CountryServiceImpl countryService;
    private static Country country = CountryFactory.createCountry("CHI", "China");
    private static City city = CityFactory.createCity("WHU", "Wuhan", country);

    @Order(0)
    @Test
    void a_start(){
        assertNotNull(countryService.create(country));
    }
    @Order(1)
    @Test
    void b_create() {
        assertNotNull(cityService.create(city));
    }
    @Order(2)
    @Test
    void c_read() {
       Optional <City> read = this.cityService.read(city.getName());
        System.out.println(read);
        assertAll(
                ()-> assertTrue(read.isPresent()),
                ()-> assertSame(this.cityService, read.get())
        );
    }
    @Order(3)
      @Test
    void d_update() {
        City x = new City.Builder().copy(city).setName("Chile").build();
        assertNotNull(cityService.create(x));
    }
    @Order(4)
    @Test
    void f_delete() {
        cityService.delete(city);
    }
    @Order(5)
    @Test
    void e_getAll() {
        assertEquals(1, cityService.getAll().size());
    }
}