package za.ac.cput.group6.repository.lookup;
//Lukhona Tetyana

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group6.domain.lookup.Address;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

    List<Address> findAll();

}