package za.ac.cput.group6.factory.lookup;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.util.Helper;

public class CountryFactory {
    public static Country createCountry(String id, String name) throws IllegalArgumentException{
        if(!Helper.isValidString(id) || !Helper.isValidString(name)){
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        return new Country.Builder().setId(id).setName(name).build();
    }
}
