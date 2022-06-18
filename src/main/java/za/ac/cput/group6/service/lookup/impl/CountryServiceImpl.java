package za.ac.cput.group6.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.repository.lookup.CountryRepository;
import za.ac.cput.group6.service.lookup.ICountryService;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl  implements ICountryService {
    @Autowired
    private CountryRepository repository;

    @Override
    public Country create(Country country) {
        return repository.save(country);
    }
    @Override
    public Optional<Country> read(String name) {
        return repository.findById(name);
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public Country save(Country country) {
        return repository.save(country);
    }

    @Override
    public void delete(String s) {
        repository.deleteById(s);
    }



    public List<Country> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Country> findAll() {
        return null;
    }

    @Override
    public void deletebyId(String id) {

    }

    @Override
    public void delete(Country country) {

    }
}
