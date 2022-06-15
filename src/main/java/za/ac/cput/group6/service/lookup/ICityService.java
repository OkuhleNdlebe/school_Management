package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.lookup.City;
import za.ac.cput.group6.service.IService;
public interface ICityService extends IService<City, String> {
    void delete(City city);
}
