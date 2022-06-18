package za.ac.cput.group6.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.group6.domain.lookup.Student;

public interface StudentRepository extends JpaRepository<Student , String> {
    Student findByName(String studentID);
}
