package za.ac.cput.group6.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group6.domain.lookup.City;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
    City findByName(String name);
}
