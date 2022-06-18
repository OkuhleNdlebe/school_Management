package za.ac.cput.group6.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.group6.domain.user.Employee;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {


    List<Employee> findAll();
}
