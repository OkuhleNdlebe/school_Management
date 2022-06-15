package za.ac.cput.group6.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.repository.lookup.CountryRepository;
import za.ac.cput.group6.service.lookup.ICountryService;

import java.util.List;

@Service
public class CountryServiceImpl  implements ICountryService {
    @Autowired
    private CountryRepository repository;

    @Override
    public Country create(Country country) {
        return repository.save(country);
    }
    @Override
    public Country read(String name) {
        return repository.findByName(name);
    }

    @Override
    public Country update(Country country) {
        return repository.save(country);
    }

    @Override
    public void delete(String s) {
        repository.deleteById(s);
    }



    public List<Country> getAll() {
        return repository.findAll();
    }
}
