package za.ac.cput.group6.factory.lookup;

import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.group6.domain.lookup.Country;
import org.junit.jupiter.api.Test;
class CountryFactoryTest {


    @Test
    void createCountrySuccess() throws IllegalArgumentException {
        Country country = CountryFactory.createCountry("23XM", "Zimbabwe");
        assertNotNull(country);
        System.out.println(country);
    }

    @Test
    void createCountryFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            CountryFactory.createCountry(" ", "Zimbabwe");
        });
        System.out.println("Thrown an error as expected");
    }
}