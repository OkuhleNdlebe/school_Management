package za.ac.cput.group6.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group6.domain.lookup.StudentAddress;

import java.util.Optional;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, String> {
    StudentAddress findByName(String studentID);
}
