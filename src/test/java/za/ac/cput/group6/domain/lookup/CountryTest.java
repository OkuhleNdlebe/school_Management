package za.ac.cput.group6.domain.lookup;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class CountryTest {
    @Test
    void test(){
        Country country = new Country.Builder()
                .setId("34674995767")
                .setName("South Africa")
                .build();
        System.out.println(country);

    }


}