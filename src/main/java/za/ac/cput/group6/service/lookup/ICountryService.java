package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.lookup.Address;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.service.IService;
import java.util.List;

public interface ICountryService extends IService<Country, String> {
    List <Country> findAll();
    void deletebyId(String id);
    Country save(Country country);
}
