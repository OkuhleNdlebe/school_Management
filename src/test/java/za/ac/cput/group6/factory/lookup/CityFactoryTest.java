package za.ac.cput.group6.factory.lookup;

import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.domain.lookup.City;
import org.junit.jupiter.api.Test;

class CityFactoryTest {

    private static Country country = CountryFactory.createCountry("RT5", "Uganda");

    @Test
    void createCitySuccess() throws IllegalArgumentException {
        City city = CityFactory.createCity("KK#", "Bush-Bush", country);
        assertNotNull(city);
        assertEquals("RT5", city.getCountyId());
        System.out.println(country.getName());
    }

    @Test
    void createCityFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            CityFactory.createCity("KK#", " ", country);
        });
        System.out.println("Thrown an error as expected");
    }

}