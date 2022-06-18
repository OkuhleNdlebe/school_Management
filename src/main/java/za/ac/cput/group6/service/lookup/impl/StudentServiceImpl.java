package za.ac.cput.group6.service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.group6.domain.lookup.Student;
import za.ac.cput.group6.repository.lookup.StudentRepository;
import za.ac.cput.group6.service.lookup.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student) {
        return repository.save(student);
    }

    @Override
    public Student read(String studentId) {
        return repository.findByName(studentId);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(Student student) {
        System.out.println(student);
        repository.delete(student);

    }
    public List<Student> getAll(){
        return repository.findAll();
    }
}
