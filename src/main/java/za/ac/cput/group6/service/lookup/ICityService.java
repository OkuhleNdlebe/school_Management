package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.domain.lookup.Country;
import za.ac.cput.group6.service.IService;
import java.util.*;

import java.util.List;

public interface ICityService extends IService<City, String> {
    void deletedById(String id);
    List<City> findAll();
    void delete(City city);
}
