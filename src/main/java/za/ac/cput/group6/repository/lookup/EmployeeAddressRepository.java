package za.ac.cput.group6.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.group6.domain.user.EmployeeAddress;

import java.util.List;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {


    List<EmployeeAddress> findAll();;

}



