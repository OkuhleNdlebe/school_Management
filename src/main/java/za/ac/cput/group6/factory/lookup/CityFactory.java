package za.ac.cput.group6.factory.lookup;

import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.util.Helper;
import za.ac.cput.group6.domain.lookup.Country;

public class CityFactory {

    public static City createCity(String id, String name, Country country) throws IllegalArgumentException{
        if(!Helper.isValidString(id) || !Helper.isValidString(name) || country == null)
            throw new IllegalArgumentException("IllegalArgumentException");
        return new City.Builder().setId(id).setName(name).setCountry(country.getId()).build();
    }
}
