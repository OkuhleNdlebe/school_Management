package za.ac.cput.group6.service.lookup;

import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.service.IService;

public interface IStudentService extends IService<Student , String> {
    void delete(Student student);
}
