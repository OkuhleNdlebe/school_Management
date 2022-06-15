package za.ac.cput.group6.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.repository.lookup.CityRepository;
import za.ac.cput.group6.service.lookup.ICityService;
import za.ac.cput.group6.domain.lookup.Country;

import java.util.List;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private CityRepository repository;

    @Override
    public City create(City city) {
        return repository.save(city);
    }

    @Override
    public City read(String name) {
        return repository.findByName(name);
    }

    @Override
    public City update(City city) {
        return repository.save(city);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(City city) {
        System.out.println(city);
        repository.delete(city);
    }

    public List<City> getAll(){
        return repository.findAll();
    }
}
