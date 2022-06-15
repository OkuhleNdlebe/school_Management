package za.ac.cput.group6.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group6.domain.lookup.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByName(String name);
    void deleteById (String id);
}
